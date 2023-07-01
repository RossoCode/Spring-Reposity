package com.example.springboot;

import com.example.springboot.Esercizio_4.Entità.Meal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController2 {
    private  static List<Meal> pasti = new ArrayList<Meal>();
    @GetMapping("/pasto")
    public List<Meal> getMeals() {return pasti;}

    @PostMapping ("post/pasto")
    public ResponseEntity<?> aggiungiPasto(@RequestBody Meal pasto){
        pasti.add(pasto);
        return new ResponseEntity<String>("pasto aggiunto ", HttpStatus.OK);    }

    @PutMapping("put/pasto/{nomePasto}")
    public ResponseEntity<String> aggiornoPasti(@PathVariable String nomePasto, @RequestBody Meal pastoAggiornato){
        for (Meal meal : pasti) {
            if (meal.getName().equals(nomePasto)) {
                meal.setName(pastoAggiornato.getName());
                meal.setDescription(pastoAggiornato.getDescription());
                meal.setPrice(pastoAggiornato.getPrice());
                return new ResponseEntity<String>("pasto aggiornato con successo...", HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("Pasto non trovato", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping ("delete/pasto/{nomePasto}")
    public ResponseEntity<String> eliminaPasti(@PathVariable String nomePasto){
        pasti.removeIf(pasto -> pasto.getName().equals(nomePasto));
        return ResponseEntity.ok("Pasto eliminato correttamente...");
    }

    @DeleteMapping ("delete/pasto/prezzo/{sogliaPrezzo}")
    public ResponseEntity<String> eliminaPasti(@PathVariable double sogliaPrezzo){
        pasti.removeIf(pasto -> pasto.getPrice() >= sogliaPrezzo);
        return ResponseEntity.ok("Pasto eliminato correttamente...");
    }

    @PutMapping("put/pasto/{nomePasto}/prezzo")
    public ResponseEntity<String> aggiornaPrezzo(@PathVariable String nomePasto, @RequestBody Meal pastoAggiornato){
        for (Meal meal : pasti) {
            if (meal.getName().equals(nomePasto)) {
                meal.setPrice(pastoAggiornato.getPrice());
                return new ResponseEntity<String>("pasto aggiornato con successo...", HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("Pasto non trovato", HttpStatus.BAD_REQUEST);
    }
}
