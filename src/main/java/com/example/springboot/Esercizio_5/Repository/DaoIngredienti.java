package com.example.springboot.Esercizio_5.Repository;



import com.example.springboot.Esercizio_5.Entity.Ingredienti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoIngredienti extends JpaRepository<Ingredienti, Long> {

}
