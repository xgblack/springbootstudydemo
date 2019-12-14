package cn.xgblack.security_demo.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * @author xg BLACK
 * @date 2019/12/14 15:42
 * description:
 */
@Service
public class MethodService {

    @PreAuthorize("hasRole('admin')")
    public String admin(){
        return "hello admin";
    }

    @Secured("ROLE_user")
    public String user(){
        return "hello user";
    }

    @PreAuthorize("hasAnyRole('admin','user')")
    public String hello(){
        return "hello hello";
    }
}
