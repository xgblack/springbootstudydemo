package cn.xgblack.sbdemo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小光
 * @date 2019/11/30 16:26
 * className: HelloController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot";
    }
}
