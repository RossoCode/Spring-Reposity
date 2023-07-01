package com.example.springboot.Esercizio_6.Entità;

public class Meal {
    private Long id;
    private String name;
    private double price;
    private String season;

    public Meal(Long id, String name, double price, String season) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.season = season;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return season;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
