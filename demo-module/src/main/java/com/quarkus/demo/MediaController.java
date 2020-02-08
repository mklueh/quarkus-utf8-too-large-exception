package com.quarkus.demo;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.*;

@RequestScoped
@Path("/content")
public class MediaController {

    @GET
    @Path("/upload")
    public Response test() {
        return Response.accepted().build();
    }


}
