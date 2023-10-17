package com.example.cardapio.controller;

import com.example.cardapio.dto.FoodRequestDTO;
import com.example.cardapio.dto.FoodResponseDTO;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cardapio")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping("/salvar")
    public String saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return "Salvou o item (" + foodData.getTitle() + ") com sucesso!";
    }

    @GetMapping("/buscar")
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList =  repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }


    @DeleteMapping("/deletar/{id}")
    public String deleteFood(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deletou o item com ID = " + id;
    }

    @PostMapping("/editar")
    public String editFood(@RequestBody FoodRequestDTO data){
        Food foodData = repository.findByTitle(data.title());
        foodData.setPrice(data.price());
        foodData.setImage(data.image());
        repository.save(foodData);
        return "editou o item (" + foodData.getTitle() + ") com sucesso!";
    }
}
