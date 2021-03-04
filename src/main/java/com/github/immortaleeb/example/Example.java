package com.github.immortaleeb.example;

public class Example {

    public static void main(String[] args) {
        System.out.println(createGreeting("world"));
    }

    static String createGreeting(String name) {
        return String.format("Hello, %s!", name);
    }

}
