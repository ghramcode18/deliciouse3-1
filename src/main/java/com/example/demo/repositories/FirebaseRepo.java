package com.example.demo.repositories;

import com.example.demo.entities.FireBaseEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirebaseRepo extends JpaRepository<FireBaseEntity, Integer> {

}
