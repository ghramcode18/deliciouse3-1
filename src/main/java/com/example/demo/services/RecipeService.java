// package delicious.delicious.services;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import delicious.delicious.repositories.RecipeRepo;
// import delicious.delicious.repositories.Recipe_StepsRepo;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import delicious.delicious.entities.RecipeEntity;
// import delicious.delicious.entities.Recipe_stepsEntity;
// import delicious.delicious.mappers.RecipeMapper;
// import delicious.delicious.mappers.Recipe_stepsMapper;
// import delicious.delicious.models.RecipeModel;
// import delicious.delicious.models.Recipe_StepsModel;
// @Service
// public class RecipeService {
//     @Autowired
//     RecipeRepo recipeRepo;

//     @Autowired
//     Recipe_StepsRepo recipe_StepsRepo;
    
//    public  List <RecipeModel>getFoodForType(String type)
//    {
//        List <RecipeEntity>recipeEntities = recipeRepo.findByType(type); 
//        return   RecipeMapper.RecipeEntityToRecipeModelAsList(recipeEntities);
//    }




//     private Recipe_stepsEntity getrecipe_steps(Recipe_stepsEntity recipe_steps) {
//      Optional<Recipe_stepsEntity> recipe_stepsEntity= recipe_StepsRepo.findById(recipe_steps.getId());
//      Recipe_StepsModel rModel =new Recipe_StepsModel();
//      rModel.builder().id(recipe_steps.getId())
//      .descripion(recipe_steps.getDescripion())
//      .step_number(recipe_steps.getStep_Number()).build();
    
//         return  Recipe_stepsMapper.Recipe_StepsModelToRecipe_StepsEntity(rModel);
//     }
    

// }
  
