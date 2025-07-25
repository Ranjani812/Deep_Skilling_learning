package com.cognizant.newcountry.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    private String code;

    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
