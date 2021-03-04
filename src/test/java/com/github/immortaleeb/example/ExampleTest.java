package com.github.immortaleeb.example;

import org.junit.jupiter.api.Test;

import static com.github.immortaleeb.example.Example.createGreeting;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ExampleTest {

    @Test
    void createGreeting_returns_hello_world() {
        assertThat(createGreeting("world"), is(equalTo("Hello, world!")));
    }

}