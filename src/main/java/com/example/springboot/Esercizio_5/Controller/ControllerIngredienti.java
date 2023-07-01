package com.example.springboot.Esercizio_5.Controller;


import com.example.springboot.Esercizio_5.Entità.Ingredienti;
import com.example.springboot.Esercizio_5.Service.ServiceIngredienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerIngredienti {

        private ServiceIngredienti ingredientService;

        @Autowired
        public ControllerIngredienti(ServiceIngredienti ingredientService) {
            this.ingredientService = ingredientService;
        }
    @GetMapping("/{id}")
    public Ingredienti getIngrediente(@PathVariable Long id) {
        return ServiceIngredienti.getIngredienteById(id);
    }

    @PostMapping
    public Ingredienti createIngrediente(@RequestBody Ingredienti ingrediente) {
        return ServiceIngredienti.createIngrediente(ingrediente);
    }

    @PutMapping("/{id}")
    public Ingredienti updateIngrediente(@PathVariable Long id, @RequestBody Ingredienti ingrediente) {
        return ServiceIngredienti.updateIngrediente(id, ingrediente);
    }

    @DeleteMapping("/{id}")
    public void deleteIngrediente(@PathVariable Long id) {
        ServiceIngredienti.deleteIngrediente(id);
    }
    }

