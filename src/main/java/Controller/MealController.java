package Controller;

import Services.MealService;
import com.example.springboot.Entità.Meal;
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
    public ResponseEntity<List<Meal>> getMeals() {
        return ResponseEntity.ok(mealService.getMeals());
    }

    @PutMapping("/put/meal")
    public ResponseEntity<String> putMeals(@RequestBody Meal meal){
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

    @PostMapping("/post/replace-meal")
    public ResponseEntity<String> replaceMeals(@RequestBody Meal meal){

        return ResponseEntity.ok("Pasto aggiornato");
    }
}
