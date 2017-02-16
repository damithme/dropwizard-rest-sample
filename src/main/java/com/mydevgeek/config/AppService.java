package com.mydevgeek.config;

import com.mydevgeek.resources.PersonResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by DAM on 2/16/17.
 */
public class AppService extends Application<AppConfig> {

    public static void main(String[] args) throws Exception{
        new AppService().run(args);
    }

    public void run(AppConfig appConfig, Environment environment) throws Exception {
        environment.jersey().register(PersonResource.class);
    }

    @Override
    public void initialize(Bootstrap<AppConfig> bootstrap) {

    }
}
