package cn.xgblack.cors1_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/3 15:52
 * description:
 */
@RestController
//@CrossOrigin(origins = "http://localhost:8081")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello cors";
    }

    @PutMapping("/doput")
    public String doPut(){
        return "doPut";
    }
}
