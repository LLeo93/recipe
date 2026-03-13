package com.riecipe.controller;


import com.riecipe.model.Recipe;
import com.riecipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("/country/{country}")
    public List<Recipe> getByCountry(@PathVariable String country) {
        return recipeService.getByCountry(country);
    }

    @GetMapping("/{id}")
    public Recipe getById(@PathVariable String id) {
        return recipeService.getById(id);
    }
    @GetMapping("/test-db")
    public List<Recipe> testDb() {
        return recipeService.getAll();
    }
}
