package com.example.springboot.Esercizio_4.Controller;

import com.example.springboot.Esercizio_4.Entità.Meals;
import com.example.springboot.Esercizio_4.Services.MealService;
import com.example.springboot.Esercizio_4.Entità.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class MealController {
    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/get/meal")
    public ResponseEntity<List<Meals>> getMeals() {
        return ResponseEntity.ok(mealService.getMeals());
    }

    @PostMapping("/post/meal")
    public ResponseEntity<String> putMeals(@RequestBody Meals meal){
       try {
           mealService.addMeal(meal);
       } catch (IllegalArgumentException e) {
           return ResponseEntity.badRequest().body(e.getMessage());
       }
        return ResponseEntity.ok("Pasto aggiunto");
    }

    @DeleteMapping("/delete/meal/{mealName}")
    public ResponseEntity<String> deleteMeals(@RequestBody String mealName){
        mealService.removeMeal(mealName);
        return ResponseEntity.ok("Pasto eliminato");
    }

    @PutMapping("/put/replace-meal")
    public ResponseEntity<String> replaceMeals(@RequestBody Meals meal){
        mealService.updateMeal(meal);
        return ResponseEntity.ok("Pasto aggiornato");
    }
}
