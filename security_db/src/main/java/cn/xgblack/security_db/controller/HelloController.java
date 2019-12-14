package cn.xgblack.security_db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/14 19:51
 * description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/dba/hello")
    public String dba(){
        return "dba...";
    }

    @GetMapping("/root/hello")
    public String root(){
        return "root...";
    }

    @GetMapping("/admin/hello")
    public String admin(){
        return "admin...";
    }

    @GetMapping("/user/hello")
    public String user(){
        return "user...";
    }

}
