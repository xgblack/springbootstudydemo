package cn.xgblack.devtools_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/9 21:20
 * description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello devtools";
    }
}
