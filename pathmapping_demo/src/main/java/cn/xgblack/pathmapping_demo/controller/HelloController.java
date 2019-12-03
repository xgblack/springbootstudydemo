package cn.xgblack.pathmapping_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xg BLACK
 * @date 2019/12/3 22:20
 * description:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
