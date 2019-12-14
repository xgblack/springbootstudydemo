package cn.xgblack.oauth2_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/14 21:36
 * description:
 */
@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin(){
        return "/admin/hello";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "/user/hello";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
