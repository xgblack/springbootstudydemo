package cn.xgblack.mybatis_demo;

import cn.xgblack.mybatis_demo.entity.User;
import cn.xgblack.mybatis_demo.mapper.UserMapper;
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
public class MybatisTest {
    @Autowired
    UserMapper mapper;

    @Test
    public void testGetAllUser(){
        List<User> users = mapper.getAllUser();

        System.out.println(users);


    }
}
