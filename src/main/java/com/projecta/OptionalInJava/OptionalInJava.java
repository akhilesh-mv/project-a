package com.projecta.OptionalInJava;

import java.util.Optional;

public class OptionalInJava {

    public static void main(String[] args) {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent());
    }
}
