package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.RecipeEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends JpaRepository<RecipeEntity, Integer> {
    List<RecipeEntity> findByType(String type);

}
