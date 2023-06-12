package com.example.springboot.Esercizio_2;

import com.example.springboot.Entità.Meal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MealController {
    static List<Meal> meals = Arrays.asList(
            new Meal("Pasta", "Pasta fatta in casa", 7),
            new Meal("Pizza", "Meglio di una pizza cosa vuoi?", 4.5),
            new Meal("Kebab", "con cipolla o senza?", 5),
            new Meal("Piadina", "salsa e formaggio", 3),
            new Meal("Segreto della casa", "segreto della casa", 9)
    );
    @GetMapping("/meal")
    public List<Meal> getMeals() {return meals;}

    @GetMapping("/meal/{name}")
    public ResponseEntity<?> getMealByName(@PathVariable String name)
    {
        for (Meal meal : meals) {
            if(meal.getName().equals(name)){
                return new ResponseEntity<Meal>(meal, HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("Non ho trovato nulla", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/meal/description-match/{description}")
    public ResponseEntity<?> getMealByDescription(@PathVariable String description)
    {
        for (Meal meal : meals) {
            if(meal.getDescription().contains(description)){
                return new ResponseEntity<Meal>(meal, HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("Non ho trovato nulla", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/meal/price")
    public ResponseEntity<?> getMealByPrice(@RequestParam("min") double minPrice, @RequestParam("max") double maxPrice) {
        List<Meal> mealsInRange = new ArrayList<>();
        for (Meal meal : meals) {
            if (meal.getPrice() >= minPrice && meal.getPrice() <= maxPrice) {
                mealsInRange.add(meal);
            }
        }
        if (!mealsInRange.isEmpty()) {
            return new ResponseEntity<>(mealsInRange, HttpStatus.OK);
        }
        return new ResponseEntity<>("Non ho trovato nulla", HttpStatus.NOT_FOUND);
    }
}
