//package com.example.springboot.Esercizio_6.Controller;
//
//import com.example.springboot.Esercizio_6.Entità.Meal;
//import com.example.springboot.Esercizio_6.Service.WinterMealService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/winter-meals")
//public class WinterMealController {
//    private final WinterMealService winterMealService;
//
//    public WinterMealController(WinterMealService winterMealService) {
//        this.winterMealService = winterMealService;
//    }
//
//    @GetMapping
//    public List<Meal> getWinterMeals() {
//        return winterMealService.getWinterMeals();
//    }
//
//    @PostMapping
//    public Meal createWinterMeal(@RequestBody Meal meal) {
//        return winterMealService.createWinterMeal(meal);
//    }
//
//    @PutMapping("/{id}")
//    public Meal updateWinterMeal(@PathVariable Long id, @RequestBody Meal meal) {
//        return winterMealService.updateWinterMeal(id, meal);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteWinterMeal(@PathVariable Long id) {
//        winterMealService.deleteWinterMeal(id);
//    }
//}
