package cn.xgblack.weicome_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xg BLACK
 * @date 2019/12/3 23:21
 * description:
 */
@Controller
public class HelloController {
    @GetMapping("/index")
    public String hello(){
        return "index";
    }
}
