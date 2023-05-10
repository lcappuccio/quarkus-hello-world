package org.acme.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

    private final HelloService sut = new HelloService();

    @Test
    void should_return_parametrized_message() {
        String someMessage = sut.greeting("someMessage");

        assertEquals("hello someMessage", someMessage);
    }

}
