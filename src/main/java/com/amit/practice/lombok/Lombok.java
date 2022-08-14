package com.amit.practice.lombok;

import lombok.Data;

@Data
public class Lombok {
    public String name;
    public String address;

    public Lombok(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
