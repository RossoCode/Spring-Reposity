//package com.example.springboot.Esercizio_6.Dao;
//
//import com.example.springboot.Esercizio_6.Entità.Meal;
//import com.example.springboot.Esercizio_6.Entità.Season;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WinterDao {
//    private final List<Meal> meals = new ArrayList<>();
//    private long nextId = 1;
//
//    public Meal findById(Long id) {
//        for (Meal meal : meals) {
//            if (meal.getId().equals(id)) {
//                return meal;
//            }
//        }
//        return null;
//    }
//
//    public List<Meal> findBySeason(Season season) {
//        List<Meal> winterMeals = new ArrayList<>();
//        for (Meal meal : meals) {
//            if (meal.getSeason().equals(season)) {
//                winterMeals.add(meal);
//            }
//        }
//        return winterMeals;
//    }
//
//    public Meal save(Meal meal) {
//        meal.setId(nextId++);
//        meals.add(meal);
//        return meal;
//    }
//
//    public Meal update(Meal meal) {
//        for (int i = 0; i < meals.size(); i++) {
//            Meal existingMeal = meals.get(i);
//            if (existingMeal.getId().equals(meal.getId())) {
//                meals.set(i, meal);
//                return meal;
//            }
//        }
//        return null;
//    }
//
//    public boolean delete(Meal meal) {
//        return meals.remove(meal);
//    }
//}
