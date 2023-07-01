package com.example.springboot.Esercizio_4.Services;

import com.example.springboot.Esercizio_4.Dao.MealDao;
import com.example.springboot.Esercizio_4.Entità.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;

    @Autowired
    public MealService(MealDao mealDao) {
    this.mealDao = mealDao;
    }

    public void addMeal(Meal meal) {
        if (meal == null) throw new IllegalArgumentException("Il pasto non può essere vuoto");
        if (meal.getName() == null || meal.getName().isEmpty()) throw new IllegalArgumentException("Nome pasto non può essere nullo");
        if (meal.getDescription() == null || meal.getDescription().isEmpty()) throw new IllegalArgumentException("Descrizione pasto non può essere nullo");
        if (meal.getPrice() <= 0) throw new IllegalArgumentException("Il pasto non può avere un prezzo uguale oo più basso di 0");
        if (meal.getPrice() > 100) throw new IllegalArgumentException("Il pasto non può avere un prezzo superiore a 100");
        mealDao.addMeal(meal);
    }

    public void removeMeal(String  mealName) {
        mealDao.removeMeal(mealName);
    }

    public void updateMeal(Meal meal) {
        mealDao.updateMeal(meal);
    }

    public List<Meal> getMeals() {
        return mealDao.getMeals();
    }

}
