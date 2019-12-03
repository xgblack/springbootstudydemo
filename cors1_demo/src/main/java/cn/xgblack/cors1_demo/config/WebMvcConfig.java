package cn.xgblack.cors1_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xg BLACK
 * @date 2019/12/3 16:16
 * description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:8081")
        .allowedHeaders("*")
        .allowedMethods("*")
        .maxAge(30 * 1000);
    }
}
