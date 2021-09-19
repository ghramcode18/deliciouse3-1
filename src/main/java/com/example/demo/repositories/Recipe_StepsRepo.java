package com.example.demo.repositories;

import com.example.demo.entities.Recipe_stepsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recipe_StepsRepo extends JpaRepository<Recipe_stepsEntity, Integer> {

}
