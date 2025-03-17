package com.example.demo2.controllers;

import com.example.demo2.facturex.InvoiceProcessorService;
import com.example.demo2.facturex.dto.XmlInvoiceDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.util.Base64;
import java.util.Map;


@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceProcessorService invoiceProcessorService;

    /**
     * Endpoint to extract values from the DTO and print them.
     */
    @PostMapping("/print-dto")
    public ResponseEntity<String> printInvoiceDTO(@RequestBody Map<String, String> request) {
        try {
            // Extract Base64 string from JSON request
            String base64Pdf = request.get("base64Pdf");
            if (base64Pdf == null || base64Pdf.trim().isEmpty()) {
                return ResponseEntity.badRequest().body("Invalid request: base64Pdf is missing.");
            }

            // Decode Base64 into a byte array
            byte[] pdfBytes = Base64.getDecoder().decode(base64Pdf);

            // Convert byte array into an InputStream
            ByteArrayInputStream pdfStream = new ByteArrayInputStream(pdfBytes);

            // Process the PDF and extract the invoice DTO
            XmlInvoiceDetailsDTO invoiceDTO = invoiceProcessorService.processInvoice(pdfStream);

            // Print extracted values
            String output = "Extracted Invoice Data:\n"
                    + "ID: " + invoiceDTO.getExchangedDocument().getId() + "\n"
                    + "TypeCode: " + invoiceDTO.getExchangedDocument().getTypeCode() + "\n"
                    + "InvoiceCurrencyCode: " + invoiceDTO.getTradeTransaction().getTradeSettlement().getInvoiceCurrencyCode();

            System.out.println(output);
            return ResponseEntity.ok(output);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid Base64 encoding: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error processing invoice: " + e.getMessage());
        }
    }


}
