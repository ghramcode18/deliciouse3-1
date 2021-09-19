package com.example.demo.services;


import com.example.demo.entities.UserEntity;
import com.example.demo.exceptions.UserException;
import com.example.demo.mappers.UserMapper;
import com.example.demo.models.UserModel;
import com.example.demo.repositories.RecipeRepo;
import com.example.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
//user interface and service class

    @Autowired
    UserRepo userRepo;

    @Autowired
    RecipeRepo recipeRepo;

    @Autowired
    private UserMapper userMapper;

    public UserModel registerUser(UserModel user) throws UserException {
        if (user.getEmail() != null && user.getPassword() != null && user.getUserName() != null) {
            //check if email does not exist
            if (!userRepo.findByEmail(user.getEmail()).isPresent()) {
                UserEntity entity = userRepo.save(userMapper.userModelToUserEntity(user));
                user.setUserId(entity.getId());
                return user;
            } else {
                throw new UserException("this email already exists");
            }
        } else {
            throw new UserException("required fields are null");
        }
    }


    // public UserModel registerUser(UserModel user) {
    //     if (user.getEmail() != null && user.getPassword() != null && user.getUserName() != null) {
    //         if (userRepo.findByEmail(user.getEmail()).isEmpty())
    //             return UserMapper.INSTANCE
    //                     .UserEntityToUserModel(userRepo.save(UserMapper.INSTANCE.UserModelToUserEntity(user)));
    //         // {//userRepo.save(UserMapper.INSTANCE.UserModelToUserEntity(user));

    //         // if(userRepo.findByEmail(user.getEmail()).isEmpty())
    //         // {
    //         // UserEntity entity =
    //         // userRepo.save(UserMapper.INSTANCE.UserModelToUserEntity(user));
    //         // return user.builder().userId(entity.getId())
    //         // .userName(entity.getUserName())
    //         // .email(entity.getEmail())
    //         // .password(entity.getPassword())
    //         // .build();
    //         // }
    //         else {
    //             throw new UserException("this email is already exist");
    //         }
    //     } else {
    //         throw new UserException("required fields are null");


    // TODO please check my @Bean

    // public UserModel registerUser(UserModel user) throws UserException {
    // if (user.getEmail() != null && user.getPassword() != null &&
    // user.getUserName() != null) {
    // if (userRepo.findByEmail(user.getEmail()).isEmpty()) {
    // UserEntity entity = userRepo.save(userMapper.UserModelToUserEntity(user));
    // return user.builder().userId(entity.getId()).build();
    // } else {
    // throw new UserException("this email is already exist");
    // }
    // } else {
    // throw new UserException("required fields are null");

    // }
    // }

    public UserModel signIn(UserModel user) throws UserException {
        Optional<UserEntity> entity = userRepo.findByEmail(user.getEmail());
        if (!entity.isPresent()) {
            throw new UserException("no user registered with this email");
        } else {
            if (entity.get().getPassword().equals(user.getPassword())) {
                return userMapper.userEntityToUserModel(entity.get());
            } else {
                throw new UserException("wrong password");
            }
        }
    }

    // public UserModel addFavorite(Integer id, RecipeModel rModel) {
    // if (id == null)
    // throw new UserException("can't user or recipe with this id");

    // UserEntity entity = userRepo.findById(id).orElseThrow(() -> new
    // UserException("no user with this id"));
    // entity.getFavorites().add(RecipeMapper.RecipeModelToRecipeEntity(rModel));
    // userRepo.save(entity);
    // return UserMapper.mapper.UserEntityToUserModel(entity);

    // }

    // public List<RecipeModel> getFavorite(Integer id) {
    // if (id == null)
    // throw new UserException("can't user with this id");
    // UserEntity entity = userRepo.findById(id).orElseThrow(() -> new
    // UserException("no user with this id"));
    // return RecipeMapper.RecipeEntityToRecipeModelAsList(entity.getFavorites());

    // }

}
