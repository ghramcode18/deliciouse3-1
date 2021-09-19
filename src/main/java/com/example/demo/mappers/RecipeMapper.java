package com.example.demo.mappers;

import java.util.List;

import com.example.demo.entities.RecipeEntity;
import com.example.demo.models.RecipeModel;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public abstract class RecipeMapper {
    public static RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    public abstract RecipeEntity RecipeModelToRecipeEntity(RecipeModel RecipeModel);

    public abstract   RecipeModel RecipeEntityToRecipeModel(RecipeEntity RecipeEntity);

    public abstract  List<RecipeEntity> RecipeModelToRecipeEntityAslist(List<RecipeModel> RecipeModel);

    public abstract  List<RecipeModel> RecipeEntityToRecipeModelAsList(List<RecipeEntity> RecipeEntities) ;
}
// public interface RecipeMapper
// {//CAN I PUT ALL OF MAPPERIN ONE CLASSE?
// public static RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);
// @Mapping (source = "",target = "")
// static
// RecipeEntity RecipeModelToRecipeEntity(RecipeModel RecipeModel) {
// // TODO Auto-generated method stub
// return null;
// }
// RecipeModel RecipeEntityToRecipeModel(RecipeEntity RecipeEntity);
// List<RecipeEntity> RecipeModelToRecipeEntityAslist(List<RecipeModel>
// RecipeModel);
// static List<RecipeModel> RecipeEntityToRecipeModelAsList(List<RecipeEntity>
// RecipeEntities) {
// // TODO Auto-generated method stub
// return null;
// }

// }

// // //source the name in Entity and target the name in Model.
