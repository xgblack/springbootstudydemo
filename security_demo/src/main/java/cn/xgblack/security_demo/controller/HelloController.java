package cn.xgblack.security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/10 16:39
 * description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }

    @GetMapping("/login")
    public String login(){
        return "please login ";
    }
}
