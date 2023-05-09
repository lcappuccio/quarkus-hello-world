package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String greeting(final String message) {
        return "hello " + message;
    }
}
