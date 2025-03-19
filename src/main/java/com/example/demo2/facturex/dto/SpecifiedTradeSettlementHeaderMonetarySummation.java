package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecifiedTradeSettlementHeaderMonetarySummation")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecifiedTradeSettlementHeaderMonetarySummation {
    @XmlElement(name = "GrandTotalAmount", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String montantTotalFactureTVA;

    public String getMontantTotalFactureTVA() {
        return montantTotalFactureTVA;
    }

    public void setMontantTotalFactureTVA(String montantTotalFactureTVA) {
        this.montantTotalFactureTVA = montantTotalFactureTVA;
    }
}
