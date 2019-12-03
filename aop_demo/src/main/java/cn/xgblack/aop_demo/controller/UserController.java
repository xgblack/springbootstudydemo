package cn.xgblack.aop_demo.controller;

import cn.xgblack.aop_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/3 23:01
 * description:
 */
@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/test1")
    public String getUserNameById(Integer id) {
        return service.getUserNameById(id);
    }

    @GetMapping("/test2")
    public void deleteUserById(Integer id) {
        service.deleteUserById(id);
    }
}
