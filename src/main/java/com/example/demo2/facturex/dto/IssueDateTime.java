package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IssueDateTime")
public class IssueDateTime {

    @XmlElement(name = "DateTimeString", namespace = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100")
    private String DateTimeString;

    public String getDateTimeString() {
        return DateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        DateTimeString = dateTimeString;
    }
}
