package com.riecipe.service;
import com.riecipe.model.Recipe;
import com.riecipe.repository.RecipeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public List<Recipe> getByCountry(String country) {
        return recipeRepository.findByCountryIgnoreCase(country);
    }
    public Recipe getById(String id) {
        System.out.println("Cerco la ricetta con ID: " + id);
        List<Recipe> tutte = recipeRepository.findAll();
        System.out.println("Nel database ci sono in totale " + tutte.size() + " ricette.");

        return recipeRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Ricetta non trovata"));
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }
    @Autowired
    private org.springframework.data.mongodb.core.MongoTemplate mongoTemplate;

    @PostConstruct
    public void checkConnection() {
        System.out.println("--------------------------------");
        System.out.println("ENV URI: " + System.getenv("SPRING_DATA_MONGODB_URI"));
        System.out.println("CONNESSO AL DATABASE: " + mongoTemplate.getDb().getName());
        System.out.println("COLLEZIONI PRESENTI: " + mongoTemplate.getCollectionNames());
        System.out.println("--------------------------------");
    }

}