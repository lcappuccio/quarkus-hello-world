package org.acme.health;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

@QuarkusTest
class HelloWorldHealthCheckTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/q/metrics")
                .then()
                .statusCode(200)
                .body(is("Hello from RESTEasy Reactive"));
    }

    @Test
    void testGreetingEndpoint() {
        String nameForTest = UUID.randomUUID().toString();
        given()
                .pathParam("name", nameForTest)
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + nameForTest));
    }
}
