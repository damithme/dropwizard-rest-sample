package com.mydevgeek.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DAM on 2/16/17.
 */
@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @GET
    public List<String> getPersons() {
        return Arrays.asList("A", "B", "C");
    }


}
