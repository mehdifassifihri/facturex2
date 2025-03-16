package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "ApplicableHeaderTradeSettlement")
@XmlAccessorType(XmlAccessType.FIELD)
public class TradeSettlement {

    @XmlElement(name = "InvoiceCurrencyCode", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String invoiceCurrencyCode;

    @XmlElement(name = "ReceivableSpecifiedTradeAccountingAccount", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private ReceivableSpecifiedTradeAccountingAccount receivableSpecifiedTradeAccountingAccount;

}
