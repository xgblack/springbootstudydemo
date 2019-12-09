package cn.xgblack.devtools_demo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xg BLACK
 * @date 2019/12/9 22:01
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService service;
    @Test
    public void testSayHello(){
        String hello = service.sayHello("xgBLACK");
        Assert.assertThat(hello, Matchers.is("hello xgBLACK"));
    }
}
