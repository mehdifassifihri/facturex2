package com.example.demo2.facturex;

import com.example.demo2.facturex.dto.XmlInvoiceDetailsDTO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification;
import org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Map;

@Service
public class InvoiceProcessorService {

    /**
     * Processes the uploaded PDF file:
     * 1. Extracts the embedded XML.
     * 2. Parses it into an Invoice object.
     */
    public XmlInvoiceDetailsDTO processInvoice(MultipartFile file) throws IOException {
        // Extract XML from PDF in memory
        byte[] xmlBytes = extractXmlFromPdf(file.getInputStream());
        if (xmlBytes == null) {
            throw new IOException("No embedded XML found in the PDF.");
        }

        // Parse XML to Java Object
        return parseXmlToInvoice(xmlBytes);
    }

    /**
     * Extracts an XML file embedded inside a PDF.
     */
    public byte[] extractXmlFromPdf(InputStream pdfStream) throws IOException {
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
        } catch (JAXBException | IOException e) {
            throw new RuntimeException("Error parsing XML: " + e.getMessage(), e);
        }
    }
}
