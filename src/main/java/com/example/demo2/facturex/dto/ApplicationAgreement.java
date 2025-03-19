package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ApplicableHeaderTradeAgreement")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationAgreement {
    @XmlElement(name = "BuyerReference", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    String BuyerReference;
    @XmlElement(name = "BuyerOrderReferencedDocument", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    BuyerOrderReferencedDocument buyerOrderReferencedDocument;

    @XmlElement(name = "SpecifiedProcuringProject", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    SpecifiedProcuringProject specifiedProcuringProject;

    @XmlElement(name = "SellerTradeParty", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    SellerTradeParty sellerTradeParty;

    @XmlElement(name = "BuyerTradeParty", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    BuyerTradeParty buyerTradeParty;
    @XmlElement(name = "BuyerAgentTradeParty", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    AgentAcheteur agentAcheteur;

    @XmlElement(name = "ContractReferencedDocument", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    ContractReferencedDocument contractReferencedDocument;

    public ContractReferencedDocument getContractReferencedDocument() {
        return contractReferencedDocument;
    }

    public void setContractReferencedDocument(ContractReferencedDocument contractReferencedDocument) {
        this.contractReferencedDocument = contractReferencedDocument;
    }

    public BuyerTradeParty getBuyerTradeParty() {
        return buyerTradeParty;
    }

    public void setBuyerTradeParty(BuyerTradeParty buyerTradeParty) {
        this.buyerTradeParty = buyerTradeParty;
    }

    public String getBuyerReference() {
        return BuyerReference;
    }

    public void setBuyerReference(String buyerReference) {
        BuyerReference = buyerReference;
    }

    public SellerTradeParty getSellerTradeParty() {
        return sellerTradeParty;
    }

    public void setSellerTradeParty(SellerTradeParty sellerTradeParty) {
        this.sellerTradeParty = sellerTradeParty;
    }

    public SpecifiedProcuringProject getSpecifiedProcuringProject() {
        return specifiedProcuringProject;
    }

    public void setSpecifiedProcuringProject(SpecifiedProcuringProject specifiedProcuringProject) {
        this.specifiedProcuringProject = specifiedProcuringProject;
    }

    public BuyerOrderReferencedDocument getBuyerOrderReferencedDocument() {
        return buyerOrderReferencedDocument;
    }

    public void setBuyerOrderReferencedDocument(BuyerOrderReferencedDocument buyerOrderReferencedDocument) {
        this.buyerOrderReferencedDocument = buyerOrderReferencedDocument;
    }

    public AgentAcheteur getAgentAcheteur() {
        return agentAcheteur;
    }

    public void setAgentAcheteur(AgentAcheteur agentAcheteur) {
        this.agentAcheteur = agentAcheteur;
    }
}
