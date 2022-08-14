package com.amit.practice.junit;

import java.util.*;
import java.util.stream.Collectors;

public class ToDoServiceImpl implements ToDoService {

    @Override
    public List<String> getUsers(String user) {
        List<String> users = new ArrayList<>();
        users.add("Java");
        users.add("C");
        users.add("C++");
        users.add("Perl");
        users.stream()
                .filter(ele -> users.contains("Java"))
                .collect(Collectors.toList());

        for (String name : users) {
            System.out.println(name);
        }

        return users;
    }
}
