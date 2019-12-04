package cn.xgblack.jdbctemplate_demo;

import cn.xgblack.jdbctemplate_demo.domain.User;
import cn.xgblack.jdbctemplate_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JdbctemplateDemoApplicationTests {

    @Autowired
    UserService service;

    @Test
    public void testAdd(){
        User user = new User(null,"xgBLACK","blog.xgblack.cn");
        service.addUser(user);
    }
    @Test
    public void testUpdate(){
        User user = new User(1,"小光","blog.xgblack.cn");
        service.updateUsernameById(user);
    }
    @Test
    public void testDelete(){
        service.deleteUserById(2);
    }
    @Test
    public void testGetAllUsers(){
        List<User> users = service.getAllUsers();
        System.out.println(users);
    }
    @Test
    void contextLoads() {
    }

}
