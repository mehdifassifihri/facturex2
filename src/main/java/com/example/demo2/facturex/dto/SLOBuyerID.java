package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class SLOBuyerID {

    @XmlAttribute(name = "schemeID")
    private String schemeId;  // Default or can be set dynamically

    @XmlValue
    private String numSiren;

    public SLOBuyerID() {}

    public SLOBuyerID(String schemeId, String numSiren) {
        this.schemeId = schemeId;
        this.numSiren = numSiren;
    }

    public String getNumSiren() {
        return numSiren;
    }

    public void setNumSiren(String numSiren) {
        this.numSiren = numSiren;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }
}

