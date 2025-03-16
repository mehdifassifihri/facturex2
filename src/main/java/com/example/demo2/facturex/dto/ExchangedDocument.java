package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "ExchangedDocument")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangedDocument {

    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String id;

    @XmlElement(name = "TypeCode", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String typeCode;

    @XmlElement(name = "IssueDateTime", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private IssueDateTime isueDateTime;
}
