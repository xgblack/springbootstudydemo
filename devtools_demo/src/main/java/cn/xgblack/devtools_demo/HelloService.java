package cn.xgblack.devtools_demo;

import org.springframework.stereotype.Service;

/**
 * @author xg BLACK
 * @date 2019/12/9 21:59
 * description:
 */
@Service
public class HelloService {
    public String sayHello(String name){
        return "hello " + name;
    }
}
