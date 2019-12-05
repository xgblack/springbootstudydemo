package cn.xgblack.jdbctemplate_2_demo;

import cn.xgblack.jdbctemplate_2_demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Jdbctemplate2DemoApplicationTests {

    @Autowired
    @Qualifier("templateOne")
    JdbcTemplate template1;

    @Resource(name = "templateTwo")
    JdbcTemplate template2;

    @Test
    public void test(){
        List<User> userList1 = template1.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        System.out.println(userList1);
        List<User> userList2 = template2.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        System.out.println(userList2);
    }
    @Test
    void contextLoads() {
    }

}
