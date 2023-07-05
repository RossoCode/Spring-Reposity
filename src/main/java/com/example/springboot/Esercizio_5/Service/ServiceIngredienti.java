package com.example.springboot.Esercizio_5.Service;

import com.example.springboot.Esercizio_5.Repository.DaoIngredienti;
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

    public Ingredienti getIngredienteById(Long id) {
        return ingredientiDao.findById(id).orElse(null);
    }

    public Ingredienti createIngrediente(Ingredienti ingrediente) {
        return ingredientiDao.save(ingrediente);
    }

    public Ingredienti updateIngrediente(Long id, Ingredienti ingrediente) {
        Ingredienti existingIngrediente = ingredientiDao.findById(id).orElse(null);
        if (existingIngrediente != null) {
            existingIngrediente.setName(ingrediente.getName());
            existingIngrediente.setVegetarian(ingrediente.isVegetarian());
            existingIngrediente.setVegan(ingrediente.isVegan());
            existingIngrediente.setGlutenFree(ingrediente.isGlutenFree());
            existingIngrediente.setLactoseFree(ingrediente.isLactoseFree());
            return ingredientiDao.save(existingIngrediente);
        }
        return null;
    }

    public void deleteIngrediente(Long id) {
        ingredientiDao.deleteById(id);
    }
}
