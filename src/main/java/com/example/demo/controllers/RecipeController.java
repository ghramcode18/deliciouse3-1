// package delicious.delicious.controllers;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import delicious.delicious.models.RecipeModel;
// import delicious.delicious.repositories.RecipeRepo;
// import delicious.delicious.services.RecipeService;

// @RestController
// @RequestMapping(path = {"/api/v1"})
// public class RecipeController {
//     @Autowired
//     RecipeRepo  eRecipeRepo;
 
//     @Autowired
//     RecipeService recipeService;

//     @RequestMapping(value = "/recipes/{str}",method = RequestMethod.GET)
//     public List<RecipeModel> getFoodForType (@PathVariable (name = "str")String type)
//     {  
//               return recipeService.getFoodForType(type);
       
//     }

// }