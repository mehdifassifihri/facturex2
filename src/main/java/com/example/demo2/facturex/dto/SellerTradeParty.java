package com.example.demo2.facturex.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SellerTradeParty")
@XmlAccessorType(XmlAccessType.FIELD)
public class SellerTradeParty {

    @JsonIgnore
    @XmlElement(name = "GlobalID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String identifiant;

    private String identifiantVendeurSiret;

    private String identifiantVendeurCodeRoutage;

    @XmlElement(name = "Name", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String raisonSocialeVendeur;

    @XmlElement(name = "GlobalID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private GlobalID globalID;

    @XmlElement(name = "SpecifiedLegalOrganization", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SpecifiedLegalOrganization specifiedLegalOrganization;

    @XmlElement(name = "SpecifiedTaxRegistration", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SpecifiedTaxRegistration specifiedTaxRegistration;
    @XmlElement(name = "PostalTradeAddress", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private PostalTradeAddress postalTradeAddress;

    public PostalTradeAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalTradeAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public SpecifiedTaxRegistration getSpecifiedTaxRegistration() {
        return specifiedTaxRegistration;
    }

    public void setSpecifiedTaxRegistration(SpecifiedTaxRegistration specifiedTaxRegistration) {
        this.specifiedTaxRegistration = specifiedTaxRegistration;
    }

    public GlobalID getGlobalID() {
        return globalID;
    }

    public void setGlobalID(GlobalID globalID) {
        this.globalID = globalID;
    }

    public String getRaisonSocialeVendeur() {
        return raisonSocialeVendeur;
    }

    public void setRaisonSocialeVendeur(String raisonSocialeVendeur) {
        this.raisonSocialeVendeur = raisonSocialeVendeur;
    }

    public SpecifiedLegalOrganization getSpecifiedLegalOrganization() {
        return specifiedLegalOrganization;
    }

    public void setSpecifiedLegalOrganization(SpecifiedLegalOrganization specifiedLegalOrganization) {
        this.specifiedLegalOrganization = specifiedLegalOrganization;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdentifiantVendeurSiret() {
        return identifiant;
    }

    public void setIdentifiantVendeurSiret(String identifiantVendeurSiret) {
        this.identifiantVendeurSiret = identifiantVendeurSiret;
    }

    public String getIdentifiantVendeurCodeRoutage() {
        return identifiant;
    }

    public void setIdentifiantVendeurCodeRoutage(String identifiantVendeurCodeRoutage) {
        this.identifiantVendeurCodeRoutage = identifiantVendeurCodeRoutage;
    }
}
