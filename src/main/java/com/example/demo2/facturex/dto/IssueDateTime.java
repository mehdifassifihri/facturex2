package com.example.demo2.facturex.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "IssueDateTime")
public class IssueDateTime {

    @XmlElement(name = "DateTimeString", namespace = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100")
    private String DateTimeString;
}
