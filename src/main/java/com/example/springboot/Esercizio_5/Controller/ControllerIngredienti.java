package com.example.springboot.Esercizio_5.Controller;

import com.example.springboot.Esercizio_5.Entity.Ingredienti;
import com.example.springboot.Esercizio_5.Service.ServiceIngredienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerIngredienti {

    private ServiceIngredienti ingredientiService;

    @Autowired
    public ControllerIngredienti(ServiceIngredienti ingredientService) {
        this.ingredientiService = ingredientService;
    }

    @GetMapping("/get/ingredienti/{id}")
    public Ingredienti getIngrediente(@PathVariable Long id) {
        return ingredientiService.getIngredienteById(id);
    }

    @PostMapping("/post/ingredienti")
    public Ingredienti createIngrediente(@RequestBody Ingredienti ingrediente) {
        return ingredientiService.createIngrediente(ingrediente);
    }

    @PutMapping("/put/ingredienti/{id}")
    public Ingredienti updateIngrediente(@PathVariable Long id, @RequestBody Ingredienti ingrediente) {
        return ingredientiService.updateIngrediente(id, ingrediente);
    }

    @DeleteMapping("/delete/ingredienti/{id}")
    public void deleteIngrediente(@PathVariable Long id) {
        ingredientiService.deleteIngrediente(id);
    }
}


