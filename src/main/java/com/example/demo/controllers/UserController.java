//
//package com.example.demo.controllers;
//
//
//
//import com.example.demo.exceptions.UserException;
//import com.example.demo.models.UserModel;
//import com.example.demo.services.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(path = {"/api/v1/auth","/api/v1","/main"})
//public class UserController {
//    @Autowired
//    UserService userService;
//
//
//    @RequestMapping(value="/register", method=RequestMethod.POST)
//    public Object registerUser(@RequestBody UserModel user) {
//        try{
//            return userService.registerUser(user);
//        }catch(UserException e)
//        {
//            return e.getMessage();
//        }
//    }
//
//
//    @RequestMapping(value="/signIn", method=RequestMethod.POST)
//    public Object signIn(@RequestBody UserModel user) {
//        try{
//            return userService.signIn(user);
//        }catch(UserException e)
//        {
//            return e.getMessage();
//        }
//    }
//
//
//
////    @RequestMapping(value ="/getFavorites/{num}",method = RequestMethod.GET)
////    public List<RecipeModel> getFavorite(@PathVariable (name = "num")Integer id)
////    {
////     return  userService.getFavorite(id);
////    }
//
////    @RequestMapping(value ="/addFavorite/{num}",method = RequestMethod.POST)
////    public UserModel addFavorite(@PathVariable (name = "num")Integer id,RecipeModel rModel)
////    {
////     return userService.addFavorite(id, rModel);
////    }
//
//
// }
