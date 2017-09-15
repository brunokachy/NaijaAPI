/**
 *Class Name: GapsoService
 *Project Name: Gapso-web
 *Developer: Onyedika Okafor
 *Version Info:
 *Create Date: Apr 13, 2017 3:52:41 PM
 */
package com.naijaAPI.main;

import com.naijaAPI.persistence.entity.Overview;
import com.naijaAPI.persistence.entity.Region;
import com.naijaAPI.persistence.entity.States;
import com.naijaAPI.persistence.services.PortalPersistence;
import com.naijaAPI.persistence.services.ProjectConstant;
import com.naijaAPI.persistence.services.Util;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * @author Onyedika Okafor
 */
@Stateless
@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class NaijaAPIService {

    @EJB
    PortalPersistence portalPersistence;

    @EJB
    Util util;

    @GET
    @Path("overview")
    public Response overview() {
        Overview o = portalPersistence.getOverviewByCountryName(ProjectConstant.NIGERIA);
        return Response.status(200).entity(o).build();
    }

    @GET
    @Path("region")
    public Response region() {
        List<Region> regions = portalPersistence.getRegions();
        return Response.status(200).entity(regions).build();
    }
    
    @GET
    @Path("state")
    public Response state() {
        List<States> states = portalPersistence.getStates();
        return Response.status(200).entity(states).build();
    }

}
