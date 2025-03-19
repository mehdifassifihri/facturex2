package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BuyerOrderReferencedDocument")
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyerOrderReferencedDocument {
    @XmlElement(name = "IssuerAssignedID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String referenceBonCommande;

    public String getReferenceBonCommande() {
        return referenceBonCommande;
    }

    public void setReferenceBonCommande(String referenceBonCommande) {
        this.referenceBonCommande = referenceBonCommande;
    }
}
