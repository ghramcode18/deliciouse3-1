package com.example.demo.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@NoArgsConstructor
@Data @Setter @Getter @AllArgsConstructor 
@Builder

public class UserFav {
    Integer id;
    List <RecipeModel>recipeModels;
}
