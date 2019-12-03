package cn.xgblack.weicome_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = WebMvcConfigurer.class)
public class WeicomeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeicomeDemoApplication.class, args);
    }

}
