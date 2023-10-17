package com.example.cardapio.repository;

import com.example.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    Food findByTitle(String title);
}
