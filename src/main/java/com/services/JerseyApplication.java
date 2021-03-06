package com.services;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import com.services.MyResource;

public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(JacksonFeature.class);
        register(MyResource.class);
    }
}