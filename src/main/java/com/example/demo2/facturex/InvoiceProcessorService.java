package com.example.demo2.facturex;

import com.example.demo2.facturex.dto.XmlInvoiceDetailsDTO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification;
import org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Map;

@Service
public class InvoiceProcessorService {

    /**
     * Decodes a Base64-encoded PDF and processes it.
     */
    public XmlInvoiceDetailsDTO processBase64Invoice(String base64Pdf) throws IOException {
        // Decode Base64 string to byte array
        byte[] pdfBytes = decodeBase64ToBytes(base64Pdf);

        // Convert byte array to InputStream and process invoice
        return processInvoice(new ByteArrayInputStream(pdfBytes));
    }

    /**
     * Processes the uploaded PDF InputStream:
     * 1. Extracts the embedded XML.
     * 2. Parses it into an Invoice object.
     */
    public XmlInvoiceDetailsDTO processInvoice(InputStream pdfStream) throws IOException {
        byte[] xmlBytes = extractXmlFromPdf(pdfStream);
        if (xmlBytes == null) {
            throw new IOException("No embedded XML found in the PDF.");
        }
        return parseXmlToInvoice(xmlBytes);
    }

    /**
     * Extracts an XML file embedded inside a PDF.
     */
    private byte[] extractXmlFromPdf(InputStream pdfStream) throws IOException {
        try (PDDocument document = PDDocument.load(pdfStream)) {
            var catalog = document.getDocumentCatalog();
            var embeddedFiles = catalog.getNames().getEmbeddedFiles().getNames();

            for (Map.Entry<String, PDComplexFileSpecification> entry : embeddedFiles.entrySet()) {
                PDComplexFileSpecification fileSpec = entry.getValue();
                PDEmbeddedFile embeddedFile = fileSpec.getEmbeddedFile();

                if (embeddedFile != null && entry.getKey().endsWith(".xml")) {
                    try (InputStream is = embeddedFile.createInputStream();
                         ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        is.transferTo(baos);
                        return baos.toByteArray();
                    }
                }
            }
        }
        return null;
    }

    /**
     * Parses an XML byte array into an XmlInvoiceDetailsDTO object using JAXB.
     */
    private XmlInvoiceDetailsDTO parseXmlToInvoice(byte[] xmlBytes) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(xmlBytes)) {
            JAXBContext context = JAXBContext.newInstance(XmlInvoiceDetailsDTO.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (XmlInvoiceDetailsDTO) unmarshaller.unmarshal(bais);
        }
        catch (JAXBException | IOException e) {
            throw new RuntimeException("Error parsing XML: " + e.getMessage(), e);
        }
    }

    /**
     * Decodes a Base64 string into a byte array.
     */
    private byte[] decodeBase64ToBytes(String base64) {
        try {
            return Base64.getDecoder().decode(base64);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid Base64 input: " + e.getMessage(), e);
        }
    }

}
