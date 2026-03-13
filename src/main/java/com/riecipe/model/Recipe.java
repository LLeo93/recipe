package com.riecipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe {
    @Id
    private String id;
    private String title;
    private String country;
    private String ingredienti;
    private String tempoPreparazione;
    private String tempoCottura;
    private String porzioni;
    private CostoPerPersona costoPerPersona;
    private Difficolta difficolta;
    private String preparazione;
    private String categoria;
    private String imageUrl;
}