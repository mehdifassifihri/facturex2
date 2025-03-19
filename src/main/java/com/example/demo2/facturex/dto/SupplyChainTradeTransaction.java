package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SupplyChainTradeTransaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplyChainTradeTransaction {

    @XmlElement(name = "ApplicableHeaderTradeSettlement", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private TradeSettlement tradeSettlement;

    @XmlElement(name = "ApplicableHeaderTradeAgreement", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private ApplicationAgreement applicationAgreement;

    public TradeSettlement getTradeSettlement() {
        return tradeSettlement;
    }

    public void setTradeSettlement(TradeSettlement tradeSettlement) {
        this.tradeSettlement = tradeSettlement;
    }

    public ApplicationAgreement getApplicationAgreement() {
        return applicationAgreement;
    }

    public void setApplicationAgreement(
        ApplicationAgreement applicationAgreement) {
        this.applicationAgreement = applicationAgreement;
    }
}
