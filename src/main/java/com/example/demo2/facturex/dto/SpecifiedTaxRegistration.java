package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecifiedTaxRegistration")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecifiedTaxRegistration {

    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private IDBuyer Id;

    public IDBuyer getId() {
        return Id;
    }

    public void setId(IDBuyer id) {
        Id = id;
    }
}
