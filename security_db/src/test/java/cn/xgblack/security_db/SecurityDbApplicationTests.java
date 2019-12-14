package cn.xgblack.security_db;

import cn.xgblack.security_db.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityDbApplicationTests {

    @Autowired
    UserService service;

    @Test
    public void test(){

    }

    @Test
    void contextLoads() {
    }

}
