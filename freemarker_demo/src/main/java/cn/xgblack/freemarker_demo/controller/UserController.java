package cn.xgblack.freemarker_demo.controller;

import cn.xgblack.freemarker_demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 小光
 * @date 2019/12/1 20:37
 * className: HelloController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("xgBLACK >>>" + i);
            user.setAddress("blog.xgblack.cn" + i);
            //0表示男，1表示女
            user.setGender(random.nextInt(3));
            users.add(user);
        }
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/include")
    public String testInclude(Model model){
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("xgBLACK >>>" + i);
            user.setAddress("blog.xgblack.cn" + i);
            //0表示男，1表示女
            user.setGender(random.nextInt(3));
            users.add(user);
        }
        model.addAttribute("users", users);
        return "header";
    }
}
