package com.amit.practice.lombok;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Lombok l = new Lombok("Amit", "Bengaluru");
        String name = l.getName();
        String add = l.getAddress();
        System.out.println(add + " " + name);

        List<String> people = new ArrayList<>();
        people.add("Amit");
        people.add("1");
        people.add("2");
        people.add("3");
        people.add("4");

        people.stream()
                .collect(Collectors.toList());

    }
}
