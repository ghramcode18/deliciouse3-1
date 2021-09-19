package com.example.demo.services;

import com.example.demo.exceptions.UserException;
import com.example.demo.models.UserModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@PropertySource("classpath:application-test.properties")
class UserServiceTest {

    @Autowired
    protected TestEntityManager testEntityManager;

    @Autowired
    private UserService userService;

    @Test
    void test_new_user() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setEmail("test@junit.com");
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        UserModel outputModel = userService.registerUser(inputModel);

        Assertions.assertEquals(inputModel.getUserName(), outputModel.getUserName());
        Assertions.assertEquals(inputModel.getPassword(), outputModel.getPassword());

    }

    @Test
    void test_duplicate_user() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setEmail("test@junit.com");
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        UserModel outputModel = userService.registerUser(inputModel);

        //duplicate registration attempt
        Assertions.assertThrows(UserException.class, () -> userService.registerUser(inputModel));

    }

    @Test
    void test_empty_email_user() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        //email is not set in input
        Assertions.assertThrows(UserException.class, () -> userService.registerUser(inputModel));

    }


    @Test
    void test_signin_registered_user() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setEmail("test@junit.com");
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        //user registration
        UserModel outputModelRegistered = userService.registerUser(inputModel);

        //user login
        UserModel outputModelLogin = userService.signIn(inputModel);

        Assertions.assertEquals(outputModelRegistered, outputModelLogin);

    }


    @Test
    void test_signin_un_registered_user() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setEmail("test@junit.com");
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        //user not registered
        Assertions.assertThrows(UserException.class, () -> userService.signIn(inputModel));

    }

    @Test
    void test_signin_registered_user_invalid_password() {

        UserModel inputModel = new UserModel();
        inputModel.setUserId(1234);
        inputModel.setEmail("test@junit.com");
        inputModel.setUserName("tester");
        inputModel.setPassword("junit");

        //user registration
        UserModel outputModelRegistered = userService.registerUser(inputModel);

        //user login with new password
        inputModel.setPassword("TESTER");
        Assertions.assertThrows(UserException.class, () -> userService.signIn(inputModel));

    }

}