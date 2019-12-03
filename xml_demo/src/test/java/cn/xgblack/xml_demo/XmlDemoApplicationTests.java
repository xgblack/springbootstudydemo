package cn.xgblack.xml_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XmlDemoApplicationTests {
    @Autowired
    SayHello sayHello;
    @Test
    void contextLoads() {
        sayHello.sayHello();
    }

}
