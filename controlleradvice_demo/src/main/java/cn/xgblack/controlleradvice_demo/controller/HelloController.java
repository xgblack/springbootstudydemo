package cn.xgblack.controlleradvice_demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @author xg BLACK
 * @date 2019/12/2 22:18
 * description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
        return "hello";
    }
}
