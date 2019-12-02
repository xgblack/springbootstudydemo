package cn.xgblack.controller;

import cn.xgblack.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xgBLACK
 * @date 2019/11/29 21:38
 * description:
 */
@RestController
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping("/hello")
    public String hello(){
        return service.sayHello();
    }

    @GetMapping("/data")
    public List<String> getData(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("blog.xgblack.cn");
        }
        return list;
    }
}
