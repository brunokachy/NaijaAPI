/**
 *Class Name: PortalPersistence
 *Project Name: Gapso-ejb
 *Developer: Onyedika Okafor
 *Version Info:
 *Create Date: Apr 13, 2017 6:06:23 PM
 */
package com.naijaAPI.persistence.services;

import com.naijaAPI.persistence.entity.Country;
import com.naijaAPI.persistence.entity.Overview;
import com.naijaAPI.persistence.entity.Region;
import com.naijaAPI.persistence.entity.States;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;

/**
 * @author Onyedika Okafor
 */
@Stateless
public class PortalPersistence {

    @PersistenceContext(unitName = "NaijaAPIPU")
    private EntityManager em;

    public <T> T create(T t) {
        em.persist(t);
        em.flush();
        return t;
    }

    public <T> T find(Class<T> type, Object id) {
        return em.find(type, id);
    }

    public <T> void delete(T t) {
        em.remove(em.merge(t));
    }

    public <T> T update(T t) {
        return em.merge(t);
    }

    //Business Business Methods
    public Overview getOverviewByCountryName(String countryName) {
        Overview o = null;
        try {
            o = em.createQuery("SELECT o FROM Overview o WHERE o.country =:countryName", Overview.class)
                    .setParameter("countryName", countryName)
                    .getSingleResult();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return o;
    }

    public Country getCountryByName(String countryName) {
        Country o = null;
        try {
            o = em.createQuery("SELECT o FROM Country o WHERE o.name =:countryName", Country.class)
                    .setParameter("countryName", countryName)
                    .getSingleResult();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return o;
    }

    public Region getRegionByName(String regionName) {
        Region o = null;
        try {
            o = em.createQuery("SELECT o FROM Region o WHERE o.name =:regionName", Region.class)
                    .setParameter("regionName", regionName)
                    .getSingleResult();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return o;
    }

    public List<Region> getRegions() {
        List<Region> regions = new ArrayList<>();
        try {
            regions = em.createQuery("SELECT o FROM Region o", Region.class)
                    .getResultList();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return regions;
    }

    public States getStateByName(String stateName) {
        States s = null;
        try {
            s = em.createQuery("SELECT o FROM States o WHERE o.name =:stateName", States.class)
                    .setParameter("stateName", stateName)
                    .getSingleResult();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return s;
    }

    public List<States> getStates() {
        List<States> states = new ArrayList<>();
        try {
            states = em.createQuery("SELECT o FROM States o", States.class)
                    .getResultList();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return states;
    }
}
