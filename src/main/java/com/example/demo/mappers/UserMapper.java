package com.example.demo.mappers;

import java.util.List;

import com.example.demo.entities.UserEntity;
import com.example.demo.models.UserModel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

// public abstract class UserMapper {
// @Autowired 
//  public static UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

//     @Mapping(source = "userId", target = "id")
//     public abstract UserEntity UserModelToUserEntity(UserModel UserModel);

//     @Mapping(source = "id", target = "userId")
//     public abstract UserModel UserEntityToUserModel(UserEntity UserEntity);

//     public abstract List<UserEntity> UserModelToUserEntityAslist(List<UserModel> UserModel);

// public abstract List<UserModel> UserEntityToUserModelAsList(List<UserEntity> userEntities);
// }

public interface UserMapper {

public static UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
// public static PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

@Mapping(source = "userId", target = "id")
UserEntity UserModelToUserEntity(UserModel UserModel);

UserModel UserEntityToUserModel(UserEntity UserEntity);

List<UserEntity> UserModelToUserEntityAslist(List<UserModel> UserModel);

List<UserModel> UserEntityToUserModelAsList(List<UserEntity>
userEntities);

}

// //source the name in Entity and target the name in Model.
