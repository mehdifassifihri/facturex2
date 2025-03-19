package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "SpecifiedLegalOrganization")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecifiedLegalOrganization {

    @XmlElement(name = "ID", namespace = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100")
    private SLOBuyerID sloBuyerID;

    public SLOBuyerID getSloBuyerID() {
        return sloBuyerID;
    }

    public void setSloBuyerID(SLOBuyerID sloBuyerID) {
        this.sloBuyerID = sloBuyerID;
    }
}
