package cn.xgblack.applicationrunner_demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author xg BLACK
 * @date 2019/12/3 21:25
 * description:
 */
@Component
@Order(98)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//获取所有参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("sourceArgs: " + Arrays.toString(sourceArgs));

        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nomOptionArgs: " + nonOptionArgs);

        Set<String> optionNames = args.getOptionNames();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (String optionName : optionNames) {
            System.out.println(optionName + " : " + args.getOptionValues(optionName));
        }
        System.out.println(">>>>>>>>>>>>>>>>>MyApplicationRunner2结束>>>>>>>>>>>>>>>>>");
    }
}
