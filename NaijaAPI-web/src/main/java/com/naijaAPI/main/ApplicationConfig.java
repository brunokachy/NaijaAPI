package com.naijaAPI.main;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Onyedika Okafor
 */
@ApplicationPath("service")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.naijaAPI.main.CORSFilter.class);
        resources.add(com.naijaAPI.main.NaijaAPIService.class);
    }

}
