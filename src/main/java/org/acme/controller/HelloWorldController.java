package org.acme.controller;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.HelloService;

@Path("/hello")
public class HelloWorldController {

    private int goodOleInternetVisitorsCount = 0;
    private MeterRegistry meterRegistry;

    HelloWorldController(final MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.meterRegistry.gauge("Visitors.Counter", goodOleInternetVisitorsCount);
    }

    @Inject
    HelloService helloService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(final String name) {
        goodOleInternetVisitorsCount++;
        return helloService.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        goodOleInternetVisitorsCount++;
        return "Hello from RESTEasy Reactive";
    }
}
