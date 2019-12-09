package cn.xgblack.devtools_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xg BLACK
 * @date 2019/12/9 22:10
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ControllerTest2 {
    @Autowired
    TestRestTemplate template;

    @Test
    public void test(){
        String xg = template.getForObject("/hello?name={1}", String.class, "xg");
        System.out.println(xg);
    }
}
