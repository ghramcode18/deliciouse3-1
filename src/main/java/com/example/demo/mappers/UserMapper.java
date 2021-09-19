package com.example.demo.mappers;

import com.example.demo.entities.UserEntity;
import com.example.demo.models.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

//@Component
//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

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

@Mapper(componentModel = "spring")
public abstract class UserMapper {

//    public static UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
// public static PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(source = "userModel.userId", target = "id")
    public abstract UserEntity userModelToUserEntity(UserModel userModel);

    @Mapping(source = "userEntity.id", target = "userId")
    public abstract UserModel userEntityToUserModel(UserEntity userEntity);

    public abstract List<UserEntity> userModelToUserEntityAslist(List<UserModel> UserModel);

    public abstract List<UserModel> userEntityToUserModelAsList(List<UserEntity> userEntities);

}

// //source the name in Entity and target the name in Model.
