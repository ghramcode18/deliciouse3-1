package com.example.demo.models;

import com.example.demo.entities.UserEntity;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class UserModel {
    
@Bean
    public UserEntity UserModelToUserEntity(UserModel userModel)
        {
        UserEntity entity = new UserEntity().builder()
        .email(userModel.getEmail())
        .userName(userModel.getUserName())
        .id(userModel.getUserId())
        .password(userModel.getPassword()).build();
    
        return entity;
    
        }
    Integer userId;
    String userName;
    String email;
    String password;
}
