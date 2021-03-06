package cn.xgblack.commandlinerrunner_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xg BLACK
 * @date 2019/12/3 21:01
 * description:
 */
@Component
@Order(98)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner2 >>>" + Arrays.toString(args));
    }
}
