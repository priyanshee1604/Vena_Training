package com.priyanshee.FunctionalProgramming.Level5.question49;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        List<String> urls = List.of(
                "https://example.com",
                "http://invalid-url",
                "ftp://example.com",
                "https://valid-url.com"
        );

        Predicate<String> isValidURL = url -> {
            String regex = "^(https?|ftp)://[^\s/$.?#].[^\s]*$";
            return Pattern.matches(regex, url);
        };

        System.out.println(urls.stream().filter(isValidURL).toList());
    }
}

