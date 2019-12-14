package cn.xgblack.security_demo.controller;

import cn.xgblack.security_demo.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    MethodService service;

    @GetMapping("/hello1")
    public String hello1(){
        return service.admin();
    }
    @GetMapping("/hello2")
    public String hello2(){
        return service.user();
    }
    @GetMapping("/hello3")
    public String hello3(){
        return service.hello();
    }
}
