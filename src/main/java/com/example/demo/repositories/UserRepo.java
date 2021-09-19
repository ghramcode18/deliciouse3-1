package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.entities.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByEmail(String email);
    // @Query(value = "select u.name as name,c.college_name as college_name from
    // users u inner join college c ON u.college_id = c.id GROUP BY name",
    // nativeQuery = true)
    // List<List<String>> usersWithCollege();
    // @Query(value = "SELECT * FROM `user_favorites` ",nativeQuery = true)
    // List <List<String>>userWithFavorite();

}
