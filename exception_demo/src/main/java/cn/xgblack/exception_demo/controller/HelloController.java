package cn.xgblack.exception_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/3 9:52
 * description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        int i = 1 / 0;
        return "hello";
    }
}
