package com.example.demo2.facturex.controllers;


import com.example.demo2.facturex.InvoiceProcessorService;
import com.example.demo2.facturex.dto.XmlInvoiceDetailsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    private final InvoiceProcessorService invoiceProcessorService;

    public InvoiceController(InvoiceProcessorService invoiceProcessorService) {
        this.invoiceProcessorService = invoiceProcessorService;
    }

    /**
     * Endpoint to process a Base64-encoded PDF and extract invoice details.
     */
    @PostMapping("/print-dto")
    public ResponseEntity<?> printInvoiceDTO(@RequestBody Map<String, String> request) {
        try {
            String base64Pdf = request.get("base64Pdf");
            if (base64Pdf == null || base64Pdf.trim().isEmpty()) {
                return ResponseEntity.badRequest().body("Invalid request: base64Pdf is missing.");
            }

            // Process Base64 PDF and extract invoice DTO
            XmlInvoiceDetailsDTO invoiceDTO = invoiceProcessorService.processBase64Invoice(base64Pdf);


            System.out.println(invoiceDTO);
            return ResponseEntity.ok(invoiceDTO);
        }
        catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid Base64 encoding: " + e.getMessage());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error processing invoice: " + e.getMessage());
        }
    }

}
