package com.example.springboot.Esercizio_6.Service;

import com.example.springboot.Esercizio_6.Dao.WinterDao;
import com.example.springboot.Esercizio_6.Entità.Meal;
import com.example.springboot.Esercizio_6.Entità.Season;

import java.util.List;

public class WinterMealService {
    private final WinterDao winterDao;

    public WinterMealService(WinterDao mealDao) {
        this.winterDao = mealDao;
    }

    public List<Meal> getWinterMeals() {
        return winterDao.findBySeason(Season.WINTER);
    }

    public Meal createWinterMeal(Meal meal) {
        meal.setSeason(String.valueOf(Season.WINTER));
        return winterDao.save(meal);
    }

    public Meal updateWinterMeal(Long id, Meal meal) {
        Meal existingMeal = winterDao.findById(id);
        if (existingMeal == null) {
            return null;
        }
        existingMeal.setName(meal.getName());
        return winterDao.update(existingMeal);
    }

    public void deleteWinterMeal(Long id) {
        Meal existingMeal = winterDao.findById(id);
        if (existingMeal != null) {
            winterDao.delete(existingMeal);
        }
    }
}
