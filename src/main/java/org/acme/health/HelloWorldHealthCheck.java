package org.acme.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class HelloWorldHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (true) {
            return HealthCheckResponse.up("I'm alive");
        } else {
            // just an example
            return HealthCheckResponse.down("I'm dead");
        }
    }
}
