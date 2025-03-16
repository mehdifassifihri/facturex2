package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "SupplyChainTradeTransaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplyChainTradeTransaction {

    @XmlElement(name = "ApplicableHeaderTradeSettlement", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private TradeSettlement tradeSettlement;

    @XmlElement(name = "ApplicableHeaderTradeAgreement", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private ApplicationAgreement applicationAgreement;
}
