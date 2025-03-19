package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CrossIndustryInvoice", namespace = "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlInvoiceDetailsDTO {

    @XmlElement(name = "ExchangedDocument", namespace = "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100")
    private ExchangedDocument exchangedDocument;

    @XmlElement(name = "SupplyChainTradeTransaction", namespace = "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100")
    private SupplyChainTradeTransaction tradeTransaction;

    public ExchangedDocument getExchangedDocument() {
        return exchangedDocument;
    }

    public void setExchangedDocument(ExchangedDocument exchangedDocument) {
        this.exchangedDocument = exchangedDocument;
    }

    public SupplyChainTradeTransaction getTradeTransaction() {
        return tradeTransaction;
    }

    public void setTradeTransaction(
        SupplyChainTradeTransaction tradeTransaction) {
        this.tradeTransaction = tradeTransaction;
    }


}