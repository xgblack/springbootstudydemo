package cn.xgblack.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小光
 * @date 2019/9/21 16:08
 * className: QuickController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick() {
        return "springBoot !!!";
    }
}
