package com.example.demo2.facturex.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BuyerTradeParty")
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyerTradeParty {
    @JsonIgnore
    @XmlElement(name = "GlobalID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String identifiant;

    private String identifiantAcheteurSiret;

    private String identifiantAcheteurCodeRoutage;

    @XmlElement(name = "Name", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private String raisonSocialeAcheteur;
    @XmlElement(name = "SpecifiedTaxRegistration", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SpecifiedTaxRegistration specifiedTaxRegistration;

    @XmlElement(name = "GlobalID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private GlobalID globalID;

    @XmlElement(name = "SpecifiedLegalOrganization", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SpecifiedLegalOrganization specifiedLegalOrganization;

    @XmlElement(name = "PostalTradeAddress", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private PostalTradeAddress postalTradeAddress;

    public PostalTradeAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalTradeAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public String getRaisonSocialeAcheteur() {
        return raisonSocialeAcheteur;
    }

    public void setRaisonSocialeAcheteur(String raisonSocialeAcheteur) {
        this.raisonSocialeAcheteur = raisonSocialeAcheteur;
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

    public String getIdentifiantAcheteurSiret() {
        return identifiant;
    }

    public void setIdentifiantAcheteurSiret(String identifiantAcheteurSiret) {
        this.identifiantAcheteurSiret = identifiantAcheteurSiret;
    }

    public String getIdentifiantAcheteurCodeRoutage() {
        return identifiant;
    }

    public void setIdentifiantAcheteurCodeRoutage(String identifiantAcheteurCodeRoutage) {
        this.identifiantAcheteurCodeRoutage = identifiantAcheteurCodeRoutage;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public SpecifiedLegalOrganization getSpecifiedLegalOrganization() {
        return specifiedLegalOrganization;
    }

    public void setSpecifiedLegalOrganization(SpecifiedLegalOrganization specifiedLegalOrganization) {
        this.specifiedLegalOrganization = specifiedLegalOrganization;
    }
}
