package cn.xgblack.interceptor_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/3 17:33
 * description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
