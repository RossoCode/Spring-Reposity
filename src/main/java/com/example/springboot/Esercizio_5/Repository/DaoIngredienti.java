package com.example.springboot.Esercizio_5.Repository;



import com.example.springboot.Esercizio_5.Entità.Ingredienti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;


public interface DaoIngredienti extends JpaRepository<Ingredienti, Long> {
//    private static final List<Ingredienti> ingredienti = new ArrayList<>();
//    private static long nextId = 1;
//
//    public static Ingredienti findById(Long id) {
//        for (Ingredienti ingrediente : ingredienti) {
//            if (ingrediente.getId().equals(id)) {
//                return ingrediente;
//            }
//        }
//        return null;
//    }
//
//    public static Ingredienti save(Ingredienti ingrediente) {
//        ingrediente.setId(nextId++);
//        ingredienti.add(ingrediente);
//        return ingrediente;
//    }
//
//    public static boolean delete(Ingredienti ingrediente) {
//        return ingredienti.remove(ingrediente);
//    }
//
//    public Ingredienti update(Ingredienti ingrediente) {
//        for (int i = 0; i < ingredienti.size(); i++) {
//            Ingredienti existingIngrediente = ingredienti.get(i);
//            if (existingIngrediente.getId().equals(ingrediente.getId())) {
//                ingredienti.set(i, ingrediente);
//                return ingrediente;
//            }
//        }
//        return null;
//    }

}
