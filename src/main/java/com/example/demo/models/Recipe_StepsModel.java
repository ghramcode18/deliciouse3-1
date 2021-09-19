package com.example.demo.models;



import com.example.demo.entities.RecipeEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@Builder
// @NoArgsConstructor
@ToString
@RequiredArgsConstructor

public class Recipe_StepsModel {
 
    private Integer id;
    private Integer step_number;
    private String descripion;
    private RecipeEntity recipeEntity;


}
