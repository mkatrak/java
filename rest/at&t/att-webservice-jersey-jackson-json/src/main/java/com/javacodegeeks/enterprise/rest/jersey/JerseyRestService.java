package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jsonServices")
public class JerseyRestService {


    @GET
    @Path("/youtube/search/{query}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student produceJSON1(@PathParam("query") String query) {

        Student st = new Student(query, "Diaz", 22, 1);
        return st;

    }

    @GET
    @Path("/print/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student produceJSON(@PathParam("name") String name) {

        Student st = new Student(name, "Diaz", 22, 1);

        return st;

    }

    @POST
    @Path("/send")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response consumeJSON(Student student) {

        String output = student.toString();

        return Response.status(200).entity(output).build();
    }

}
