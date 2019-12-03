package cn.xgblack.paramconvert_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author xg BLACK
 * @date 2019/12/3 22:32
 * description:
 */
@RestController
public class UserController {
    @GetMapping("/hello")
    public void hello(Date birth) {
        System.out.println(birth);
    }
}
