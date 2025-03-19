package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "GlobalID")
@XmlAccessorType(XmlAccessType.FIELD)
public class GlobalID {

    @XmlAttribute(name = "schemeID")
    private String identifiantSchema;

    public String getIdentifiantSchema() {
        return identifiantSchema;
    }

    public void setIdentifiantSchema(String identifiantSchema) {
        this.identifiantSchema = identifiantSchema;
    }
}
