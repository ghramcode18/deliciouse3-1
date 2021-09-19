package com.example.demo.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class UserModel {

//    @Bean
//    public UserEntity UserModelToUserEntity(UserModel userModel)
//        {
//        UserEntity entity = new UserEntity().builder()
//        .email(userModel.getEmail())
//        .userName(userModel.getUserName())
//        .id(userModel.getUserId())
//        .password(userModel.getPassword()).build();
//
//        return entity;
//
//        }

    private Integer userId;
    private String userName;
    private String email;
    private String password;
}
