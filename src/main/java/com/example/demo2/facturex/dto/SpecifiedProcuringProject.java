package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecifiedProcuringProject")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecifiedProcuringProject {
    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String referenceProjet;

    public String getReferenceProjet() {
        return referenceProjet;
    }

    public void setReferenceProjet(String referenceProjet) {
        this.referenceProjet = referenceProjet;
    }
}
