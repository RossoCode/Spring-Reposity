package com.example.springboot;

public class Meal {
    private String name;
    private String description;
    private String price;

    public Meal(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}
