package com.example.springboot.Esercizio_5.Controller;

import com.example.springboot.Esercizio_5.Entity.Ingredienti;
import com.example.springboot.Esercizio_5.Service.ServiceIngredienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ingredienti")
public class ControllerIngredienti {


    private ServiceIngredienti ingredientiService;

    @Autowired
    public ControllerIngredienti(ServiceIngredienti ingredientService) {
        this.ingredientiService = ingredientService;
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Ingredienti> getIngredientById(@PathVariable Long id) {
        Optional<Ingredienti> ingredient = ingredientiService.getIngredienteById(id);
        return ingredient.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/post/ingredienti")
    public ResponseEntity<Ingredienti> createIngrediente(@RequestBody Ingredienti ingrediente) {
        Ingredienti ingredient = ingredientiService.createIngrediente(ingrediente);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/ingredienti/{id}")
    public ResponseEntity<Void>  deleteIngrediente(@PathVariable Long id) {
       ingredientiService.deleteIngrediente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


