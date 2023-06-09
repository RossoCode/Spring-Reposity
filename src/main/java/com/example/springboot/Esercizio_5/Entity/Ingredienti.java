package com.example.springboot.Esercizio_5.Entity;


import jakarta.persistence.*;

@Entity
@Table
public class Ingredienti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private boolean isVegetarian;
    @Column(nullable = false)
    private boolean isVegan;
    @Column(nullable = false)
    private boolean isGlutenFree;
    @Column(nullable = false)
    private boolean isLactoseFree;

    public Ingredienti(Long id, String name, boolean isVegetarian,
                       boolean isVegan,boolean isGlutenFree, boolean isLactoseFree) {
        this.id = id;
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
        this.isLactoseFree = isLactoseFree;
    }

    public Ingredienti() {
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

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public boolean isLactoseFree() {
        return isLactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        isLactoseFree = lactoseFree;
    }
}

