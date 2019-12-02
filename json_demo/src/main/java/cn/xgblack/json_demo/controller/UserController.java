package cn.xgblack.json_demo.controller;

import cn.xgblack.json_demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 小光
 * @date 2019/12/2 9:27
 * className: UserController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class UserController {
    @ResponseBody
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAddress("blog.xgblack.cn >>>" + i);
            user.setId(i);
            user.setUsername("xgBLACK >>>" + i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;
    }
}
