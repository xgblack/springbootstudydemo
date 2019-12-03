package cn.xgblack.interceptor_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xg BLACK
 * @date 2019/12/3 17:14
 * description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有路径
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**");
    }
    @Bean
    MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
}
