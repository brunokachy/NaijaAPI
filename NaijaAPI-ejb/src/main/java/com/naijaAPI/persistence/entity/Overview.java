/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naijaAPI.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Okafor Onyedika
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Overview implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String country;

    private String politicalCapital;

    private String economicCapital;

    private String officialLanguage;

    private String demonym;

    private String government;

    private String president;

    private String vicePresident;

    private String senatePresident;

    private String houseSpeaker;

    private String chiefJustice;

    private String independence;

    private String totalArea;

    private String population;

    private String currency;

    private String callingCode;

    private String shortCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoliticalCapital() {
        return politicalCapital;
    }

    public void setPoliticalCapital(String politicalCapital) {
        this.politicalCapital = politicalCapital;
    }

    public String getEconomicCapital() {
        return economicCapital;
    }

    public void setEconomicCapital(String economicCapital) {
        this.economicCapital = economicCapital;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getVicePresident() {
        return vicePresident;
    }

    public void setVicePresident(String vicePresident) {
        this.vicePresident = vicePresident;
    }

    public String getSenatePresident() {
        return senatePresident;
    }

    public void setSenatePresident(String senatePresident) {
        this.senatePresident = senatePresident;
    }

    public String getHouseSpeaker() {
        return houseSpeaker;
    }

    public void setHouseSpeaker(String houseSpeaker) {
        this.houseSpeaker = houseSpeaker;
    }

    public String getChiefJustice() {
        return chiefJustice;
    }

    public void setChiefJustice(String chiefJustice) {
        this.chiefJustice = chiefJustice;
    }

    public String getIndependence() {
        return independence;
    }

    public void setIndependence(String independence) {
        this.independence = independence;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Overview)) {
            return false;
        }
        Overview other = (Overview) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.naijaAPI.persistence.entity.Overview[ id=" + id + " ]";
    }

}
