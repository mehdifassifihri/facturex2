package com.example.demo2.controllers;

import com.example.demo2.facturex.InvoiceProcessorService;
import com.example.demo2.facturex.dto.XmlInvoiceDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceProcessorService invoiceProcessorService;

    /**
     * Endpoint to extract values from the DTO and print them.
     */
    @PostMapping("/print-dto")
    public ResponseEntity<String> printInvoiceDTO(@RequestParam("file") MultipartFile file) {
        try {
            XmlInvoiceDetailsDTO invoiceDTO = invoiceProcessorService.processInvoice(file);

            // Print extracted values
            String output = "Extracted Invoice Data:\n"
                    + "ID: " + invoiceDTO.getExchangedDocument().getId() + "\n"
                    + "TypeCode: " + invoiceDTO.getExchangedDocument().getTypeCode() + "\n"
                    + "InvoiceCurrencyCode: " + invoiceDTO.getTradeTransaction().getTradeSettlement().getInvoiceCurrencyCode()
                    ;

            System.out.println(output);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error processing invoice: " + e.getMessage());
        }
    }


}
