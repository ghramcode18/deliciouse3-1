package com.example.demo.mappers;

import com.example.demo.entities.UserEntity;
import com.example.demo.models.UserModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@PropertySource("classpath:application-test.properties")
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void userModelToUserEntity() {

        UserModel source = new UserModel();
        source.setUserId(1234);
        source.setEmail("test@junit.com");
        source.setUserName("tester");
        source.setPassword("junit");

        UserEntity destination = userMapper.userModelToUserEntity(source);

        Assertions.assertEquals(source.getUserId(), destination.getId());
        Assertions.assertEquals(source.getUserName(), destination.getUserName());
        Assertions.assertEquals(source.getPassword(), destination.getPassword());
        Assertions.assertEquals(source.getEmail(), destination.getEmail());

    }

    @Test
    void userEntityToUserModel() {

        UserEntity source = new UserEntity();
        source.setId(1234);
        source.setEmail("test@junit.com");
        source.setUserName("tester");
        source.setPassword("junit");

        UserModel destination = userMapper.userEntityToUserModel(source);

        Assertions.assertEquals(source.getId(), destination.getUserId());
        Assertions.assertEquals(source.getUserName(), destination.getUserName());
        Assertions.assertEquals(source.getPassword(), destination.getPassword());
        Assertions.assertEquals(source.getEmail(), destination.getEmail());

    }

    @Test
    void userModelToUserEntityAslist() {

        UserModel source1 = new UserModel();
        source1.setUserId(1234);
        source1.setEmail("test@junit.com");
        source1.setUserName("tester");
        source1.setPassword("junit");

        UserModel source2 = new UserModel();
        source2.setUserId(1235);
        source2.setEmail("test2@junit.com");
        source2.setUserName("tester2");
        source2.setPassword("junit2");

        List<UserEntity> destination = userMapper.userModelToUserEntityAslist(Arrays.asList(source1, source2));

        Assertions.assertEquals(source1.getUserId(), destination.get(0).getId());
        Assertions.assertEquals(source1.getUserName(), destination.get(0).getUserName());
        Assertions.assertEquals(source1.getPassword(), destination.get(0).getPassword());
        Assertions.assertEquals(source1.getEmail(), destination.get(0).getEmail());

        Assertions.assertEquals(source2.getUserId(), destination.get(1).getId());
        Assertions.assertEquals(source2.getUserName(), destination.get(1).getUserName());
        Assertions.assertEquals(source2.getPassword(), destination.get(1).getPassword());
        Assertions.assertEquals(source2.getEmail(), destination.get(1).getEmail());

    }

    @Test
    void userEntityToUserModelAsList() {

        UserEntity source1 = new UserEntity();
        source1.setId(1234);
        source1.setEmail("test@junit.com");
        source1.setUserName("tester");
        source1.setPassword("junit");

        UserEntity source2 = new UserEntity();
        source2.setId(1235);
        source2.setEmail("test2@junit.com");
        source2.setUserName("tester2");
        source2.setPassword("junit2");

        List<UserModel> destination = userMapper.userEntityToUserModelAsList(Arrays.asList(source1, source2));

        Assertions.assertEquals(source1.getId(), destination.get(0).getUserId());
        Assertions.assertEquals(source1.getUserName(), destination.get(0).getUserName());
        Assertions.assertEquals(source1.getPassword(), destination.get(0).getPassword());
        Assertions.assertEquals(source1.getEmail(), destination.get(0).getEmail());

        Assertions.assertEquals(source2.getId(), destination.get(1).getUserId());
        Assertions.assertEquals(source2.getUserName(), destination.get(1).getUserName());
        Assertions.assertEquals(source2.getPassword(), destination.get(1).getPassword());
        Assertions.assertEquals(source2.getEmail(), destination.get(1).getEmail());

    }
}
