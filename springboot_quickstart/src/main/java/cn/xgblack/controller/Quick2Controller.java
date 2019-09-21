package cn.xgblack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小光
 * @date 2019/9/21 22:23
 * className: Quick2Controller
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class Quick2Controller {
    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        //获取配置文件信息

        return "name: " + name  + "  addr: " + addr;
    }
}
