package com.example.springboot.Esercizio_4.Dao;

import com.example.springboot.Esercizio_4.Entità.Meals;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    private List<Meals> meals = new ArrayList<>();

    public void addMeal(Meals meal) {
       this.meals.add(meal);
    }
    public void removeMeal(String mealName) {
        this.meals.removeIf(meal -> meal.getName().equals(mealName));
    }

    public void updateMeal(Meals meal) {
        this.meals. removeIf(m -> m.getName().equals(meal.getName()));
        this.meals.add(meal);
    }
    public List<Meals> getMeals() {
        return this.meals;
    }


}
