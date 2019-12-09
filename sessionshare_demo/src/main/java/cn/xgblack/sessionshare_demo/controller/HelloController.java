package cn.xgblack.sessionshare_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author xg BLACK
 * @date 2019/12/9 14:39
 * description:
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("name","xgBLACK");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session){
        return ((String) session.getAttribute("name")) + port;
    }
}
