package cn.xgblack.jdbctemplate_2_demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author xg BLACK
 * @date 2019/12/5 9:12
 * description:
 */
@Configuration
public class JdbcTemplateConfig {
    @Bean
    JdbcTemplate templateOne(@Qualifier("dsOne") DataSource dsOne){
        return new JdbcTemplate(dsOne);
    }

    @Bean
    JdbcTemplate templateTwo(@Qualifier("dsTwo") DataSource dsTwo){
        return new JdbcTemplate(dsTwo);
    }
}
