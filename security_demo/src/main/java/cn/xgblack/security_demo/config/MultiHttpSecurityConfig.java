package cn.xgblack.security_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author xg BLACK
 * @date 2019/12/13 16:05
 * description:
 */
@Configuration
public class MultiHttpSecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("xg").password(new BCryptPasswordEncoder().encode("123")).roles("admin")
                .and()
                .withUser("xg2").password(new BCryptPasswordEncoder().encode("456")).roles("user")
        ;
    }

    @Configuration
    @Order(1)//优先级
    public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter{
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/admin/**").authorizeRequests().anyRequest().hasAnyRole("admin");
        }
    }
    @Configuration
    @Order(2)//优先级
    public static class OtherSecurityConfig extends WebSecurityConfigurerAdapter{
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginProcessingUrl("/doLogin")
                    .permitAll()
                    .and()
                    .csrf().disable();
        }
    }
}
