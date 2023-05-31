package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController {

    @GetMapping("/pasti")
    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<>();
        Meal meal1 = new Meal("Pasta", "Pasta fatta in casa", "7");
        meals.add(meal1);
        Meal meal2 = new Meal("Pizza", "Meglio di una pizza cosa vuoi?", "4.5");
        meals.add(meal2);
        return meals;
    }
}
