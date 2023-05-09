package org.acme.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/metrics")
@Produces("text/plain")
public class HelloWorldRegistry {

    private final MeterRegistry registry;

    HelloWorldRegistry(final MeterRegistry registry) {
        this.registry = registry;
    }
}
