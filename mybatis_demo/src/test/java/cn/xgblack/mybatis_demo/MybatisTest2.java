package cn.xgblack.mybatis_demo;

import cn.xgblack.mybatis_demo.entity.User;
import cn.xgblack.mybatis_demo.mapper1.UserMapper1;
import cn.xgblack.mybatis_demo.mapper2.UserMapper2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author xg BLACK
 * @date 2019/12/5 9:58
 * description:
 */
@SpringBootTest
public class MybatisTest2 {
    @Autowired
    UserMapper1 mapper1;

    @Autowired
    UserMapper2 mapper2;

    @Test
    public void testGetAllUsers1(){
        List<User> users = mapper1.getAllUsers();

        System.out.println(users);


    }
    @Test
    public void testGetAllUsers2(){
        List<User> users = mapper2.getAllUsers();

        System.out.println(users);


    }
}
