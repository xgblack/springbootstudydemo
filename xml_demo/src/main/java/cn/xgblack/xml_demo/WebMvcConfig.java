package cn.xgblack.xml_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xg BLACK
 * @date 2019/12/3 17:01
 * description:
 */
@Configuration
@ImportResource(locations = "classpath:beans.xml")
public class WebMvcConfig {
}
