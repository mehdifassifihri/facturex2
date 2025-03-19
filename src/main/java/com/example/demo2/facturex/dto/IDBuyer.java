package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "ID")
@XmlAccessorType(XmlAccessType.FIELD)
public class IDBuyer {
    @XmlAttribute(name = "schemeID")
    private String identifiantTva;

    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String id;

    public String getIdentifiantTva() {
        return identifiantTva;
    }

    public void setIdentifiantTva(String identifiantTva) {
        this.identifiantTva = identifiantTva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
