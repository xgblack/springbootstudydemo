package cn.xgblack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小光
 * @date 2019/9/21 15:40
 * className: QuickController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello springboot";
    }
}
