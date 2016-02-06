package com.example.haufe;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by duckm_000 on 1/26/2016.
 */

@ApplicationPath("api")
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        packages("org.foo.rest;org.bar.rest");
    }

}
