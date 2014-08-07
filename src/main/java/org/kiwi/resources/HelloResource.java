package org.kiwi.resources;

import org.kiwi.repositories.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    @Inject
    private HelloService helloService;


    @GET
    public String hello() {
        return helloService.sayHello();
    }
}
