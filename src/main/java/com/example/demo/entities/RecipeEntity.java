package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Recipe")
@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String image;

    @Column(nullable = true)
    private double price;

    @Column(nullable = true)
    private String type;

    @OneToOne
    private Recipe_stepsEntity steps;

    @Column(columnDefinition = "TEXT", length = 4000)
    private String imgrate;

    @ManyToMany(targetEntity = UserEntity.class)
    @JoinTable(name = "user_favorites", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> users_added_to_favorite;

    @ManyToMany(targetEntity = UserEntity.class)
    @JoinTable(name = "users_clicks", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> user_clicks;

    @OneToOne
    private Recipe_stepsEntity users_clicked_recipe;

}
