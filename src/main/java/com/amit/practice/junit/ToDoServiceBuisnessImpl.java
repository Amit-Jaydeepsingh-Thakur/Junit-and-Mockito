package com.amit.practice.junit;

import java.util.List;

public class ToDoServiceBuisnessImpl {
    public ToDoService toDoService;

    public ToDoServiceBuisnessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> filterUsers() {
        String user = "Java";
        return toDoService.getUsers(user);
    }
}
