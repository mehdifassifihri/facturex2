package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExchangedDocument")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangedDocument {

    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String num_facture;

    @XmlElement(name = "TypeCode", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String typeCode;

    @XmlElement(name = "IssueDateTime", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private IssueDateTime dateEmissionFactureInitiale;

    public String getNum_facture() {
        return num_facture;
    }

    public void setNum_facture(String num_facture) {
        this.num_facture = num_facture;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public IssueDateTime getDateEmissionFactureInitiale() {
        return dateEmissionFactureInitiale;
    }

    public void setDateEmissionFactureInitiale(IssueDateTime dateEmissionFactureInitiale) {
        this.dateEmissionFactureInitiale = dateEmissionFactureInitiale;
    }
}
