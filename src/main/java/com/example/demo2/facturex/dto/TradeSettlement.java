package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ApplicableHeaderTradeSettlement")
@XmlAccessorType(XmlAccessType.FIELD)
public class TradeSettlement {

    @XmlElement(name = "InvoiceCurrencyCode", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String invoiceCurrencyCode;

    @XmlElement(name = "ReceivableSpecifiedTradeAccountingAccount", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private ReceivableSpecifiedTradeAccountingAccount referenceComptableAcheteur;
    @XmlElement(name = "SpecifiedTradeSettlementHeaderMonetarySummation", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SpecifiedTradeSettlementHeaderMonetarySummation specifiedTradeSettlementHeaderMonetarySummation;

    public SpecifiedTradeSettlementHeaderMonetarySummation getSpecifiedTradeSettlementHeaderMonetarySummation() {
        return specifiedTradeSettlementHeaderMonetarySummation;
    }

    public void setSpecifiedTradeSettlementHeaderMonetarySummation(SpecifiedTradeSettlementHeaderMonetarySummation specifiedTradeSettlementHeaderMonetarySummation) {
        this.specifiedTradeSettlementHeaderMonetarySummation = specifiedTradeSettlementHeaderMonetarySummation;
    }

    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    public ReceivableSpecifiedTradeAccountingAccount getReferenceComptableAcheteur() {
        return referenceComptableAcheteur;
    }

    public void setReferenceComptableAcheteur(ReceivableSpecifiedTradeAccountingAccount referenceComptableAcheteur) {
        this.referenceComptableAcheteur = referenceComptableAcheteur;
    }
}
