package Dao;

import com.example.springboot.Entità.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MealDao {
    private List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
       this.meals.add(meal);
    }
    public void removeMeal(String mealName) {
        this.meals.removeIf(meal -> meal.getName().equals(mealName));
    }

    public void updateMeal(Meal meal) {
        this.meals. removeIf(m -> m.getName().equals(meal.getName()));
        this.meals.add(meal);
    }
    public List<Meal> getMeals() {
        return this.meals;
    }
}
