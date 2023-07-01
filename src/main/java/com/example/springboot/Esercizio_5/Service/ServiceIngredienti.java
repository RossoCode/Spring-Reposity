package com.example.springboot.Esercizio_5.Service;

import com.example.springboot.Esercizio_5.Dao.DaoIngredienti;
import com.example.springboot.Esercizio_5.Entità.Ingredienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceIngredienti {

    private DaoIngredienti ingredientiDao;

    @Autowired
    public ServiceIngredienti(DaoIngredienti ingredientiDao) {
        this.ingredientiDao = ingredientiDao;
    }

    public static Ingredienti getIngredienteById(Long id) {
        return DaoIngredienti.findById(id);
    }

    public static Ingredienti createIngrediente(Ingredienti ingrediente) {
        return DaoIngredienti.save(ingrediente);
    }

    public static Ingredienti updateIngrediente(Long id, Ingredienti ingrediente) {
        Ingredienti existingIngrediente = getIngredienteById(id);
        existingIngrediente.setName(ingrediente.getName());
        existingIngrediente.setVegetarian(ingrediente.isVegetarian());
        existingIngrediente.setVegan(ingrediente.isVegan());
        existingIngrediente.setGlutenFree(ingrediente.isGlutenFree());
        existingIngrediente.setLactoseFree(ingrediente.isLactoseFree());
        return DaoIngredienti.save(existingIngrediente);
    }

    public static void deleteIngrediente(Long id) {
        Ingredienti ingrediente = getIngredienteById(id);
        DaoIngredienti.delete(ingrediente);
    }

}

