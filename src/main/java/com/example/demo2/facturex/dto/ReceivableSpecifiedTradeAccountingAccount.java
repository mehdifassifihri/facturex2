package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "ReceivableSpecifiedTradeAccountingAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReceivableSpecifiedTradeAccountingAccount {
    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String ID;
}
