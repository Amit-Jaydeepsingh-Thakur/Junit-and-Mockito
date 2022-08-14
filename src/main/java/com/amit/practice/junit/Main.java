package com.amit.practice.junit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToDoService toDoService = new ToDoServiceImpl();
        ToDoServiceBuisnessImpl obj = new ToDoServiceBuisnessImpl(toDoService);
        obj.filterUsers();
    }
}
