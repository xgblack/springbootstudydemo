package cn.xgblack.cacheredis_demo;

import cn.xgblack.cacheredis_demo.entity.User;
import cn.xgblack.cacheredis_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootTest
@EnableCaching
class CacheredisDemoApplicationTests {

    @Autowired
    UserService service;
    @Test
    public void test(){
        User u1 = service.getUserById(1);
        System.out.println(u1);
        //service.deleteUserById(1);
        User user = new User(1, "xg", "JS");
        System.out.println(service.updateUserById(user));
        User u2 = service.getUserById(1);
        System.out.println(u2);
    }



    @Test
    void contextLoads() {
    }

}
