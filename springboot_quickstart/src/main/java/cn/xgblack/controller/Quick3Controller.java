package cn.xgblack.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
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
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {
    private String name;

    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick2() {
        //获取配置文件信息

        return "name: " + name  + "  addr: " + addr;
    }
}
