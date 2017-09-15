/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naijaAPI.persistence.services;

import com.naijaAPI.persistence.entity.Country;
import com.naijaAPI.persistence.entity.Overview;
import com.naijaAPI.persistence.entity.Region;
import com.naijaAPI.persistence.entity.States;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

/**
 *
 * @author Onyedika Okafor
 */
@Singleton
@LocalBean
@Startup
public class PortalInit {

    @EJB
    private PortalPersistence portalPersistence;

    @PostConstruct
    public void init() {
        setUpCountry();
        setUpOverview();
        setUpRegion();
        setUpStates();
    }

    @PreDestroy
    public void destroy() {
        // Do stuff during webapp's shutdown.
    }

    private void setUpOverview() {
        Overview o = portalPersistence.getOverviewByCountryName(ProjectConstant.NIGERIA);
        if (o == null) {
            try {
                o = new Overview();
                o.setCallingCode("+234");
                o.setCurrency("Naira");
                o.setDemonym("Nigerian");
                o.setEconomicCapital("Lagos");
                o.setGovernment("Federal Presidential Republic");
                o.setHouseSpeaker("Yakubu Dogara");
                o.setIndependence("October 1st, 1960");
                o.setOfficialLanguage("English");
                o.setPoliticalCapital("Abuja");
                o.setPopulation("185,989,640");
                o.setPresident("Muhammadu Buhari");
                o.setSenatePresident("Bukola Saraki");
                o.setTotalArea("923,768 sqkm");
                o.setVicePresident("Yemi Osibanjo");
                o.setCountry(ProjectConstant.NIGERIA);
                o.setChiefJustice("W. S. Nkanu Onnoghen");
                o.setShortCode("NG");
                portalPersistence.create(o);

            } catch (Exception e) {
                System.err.println("setUpOverview Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    private void setUpCountry() {
        Country c = portalPersistence.getCountryByName(ProjectConstant.NIGERIA);
        if (c == null) {
            try {
                c = new Country();
                c.setName(ProjectConstant.NIGERIA);
                portalPersistence.create(c);
            } catch (Exception e) {
                System.err.println("setUpCountry Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    private void setUpRegion() {
        Country c = portalPersistence.getCountryByName(ProjectConstant.NIGERIA);
        Region r = portalPersistence.getRegionByName(ProjectConstant.NORTH_CENTRAL);
        if (r == null) {
            try {
                r = new Region();
                r.setName(ProjectConstant.NORTH_CENTRAL);
                r.setCountry(c);
                r.setShortCode("NC");
                r.setStateCount("6");
                portalPersistence.create(r);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r2 = portalPersistence.getRegionByName(ProjectConstant.NORTH_EAST);
        if (r2 == null) {
            try {
                r2 = new Region();
                r2.setName(ProjectConstant.NORTH_EAST);
                r2.setCountry(c);
                r2.setShortCode("NE");
                r2.setStateCount("6");
                portalPersistence.create(r2);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r3 = portalPersistence.getRegionByName(ProjectConstant.NORTH_WEST);
        if (r3 == null) {
            try {
                r3 = new Region();
                r3.setName(ProjectConstant.NORTH_WEST);
                r3.setCountry(c);
                r3.setShortCode("NW");
                r3.setStateCount("7");
                portalPersistence.create(r3);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r4 = portalPersistence.getRegionByName(ProjectConstant.SOUTH_EAST);
        if (r4 == null) {
            try {
                r4 = new Region();
                r4.setName(ProjectConstant.SOUTH_EAST);
                r4.setCountry(c);
                r4.setShortCode("SE");
                r4.setStateCount("6");
                portalPersistence.create(r4);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r5 = portalPersistence.getRegionByName(ProjectConstant.SOUTH_WEST);
        if (r5 == null) {
            try {
                r5 = new Region();
                r5.setName(ProjectConstant.SOUTH_WEST);
                r5.setCountry(c);
                r5.setShortCode("SW");
                r5.setStateCount("6");
                portalPersistence.create(r5);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r6 = portalPersistence.getRegionByName(ProjectConstant.SOUTH_SOUTH);
        if (r6 == null) {
            try {
                r6 = new Region();
                r6.setName(ProjectConstant.SOUTH_SOUTH);
                r6.setCountry(c);
                r6.setShortCode("SS");
                r6.setStateCount("6");
                portalPersistence.create(r6);
            } catch (Exception e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    private void setUpStates() {

        States s1 = portalPersistence.getStateByName(ProjectConstant.ABIA);
        if (s1 == null) {
            try {
                s1 = new States();
                s1.setName(ProjectConstant.ABIA);
                s1.setCode("AB");
                s1.setRegion(portalPersistence.getRegionByName(ProjectConstant.SOUTH_EAST));
                portalPersistence.create(s1);
            } catch (Exception e) {
                System.err.println("setUpStates Error :::: " + e.getLocalizedMessage());
            }
        }
    }
}
