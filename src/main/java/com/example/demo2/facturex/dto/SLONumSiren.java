package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class SLONumSiren {

    @XmlAttribute(name = "schemeID")
    private String schemeID = "0002";  // Default or can be set dynamically

    @XmlValue
    private String value;

    public SLONumSiren() {}

    public SLONumSiren(String value, String schemeID) {
        this.value = value;
        this.schemeID = schemeID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSchemeID() {
        return schemeID;
    }

    public void setSchemeID(String schemeID) {
        this.schemeID = schemeID;
    }
}
