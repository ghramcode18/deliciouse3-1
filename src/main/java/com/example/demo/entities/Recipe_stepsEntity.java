package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "recipe_steps")
@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString

public class Recipe_stepsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(nullable = true)
    private Integer step_Number;
    @Column(columnDefinition = "TEXT", length = 43333000)
    private String Descripion;
    @OneToOne
    private RecipeEntity recipe;

}
