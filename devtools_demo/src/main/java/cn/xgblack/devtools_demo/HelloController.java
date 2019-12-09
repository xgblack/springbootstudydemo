package cn.xgblack.devtools_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/9 21:20
 * description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        return "hello " + name;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return book;
    }
}
