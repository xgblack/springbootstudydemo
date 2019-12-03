package cn.xgblack.aop_demo.service;

import org.springframework.stereotype.Service;

/**
 * @author xg BLACK
 * @date 2019/12/3 23:00
 * description:
 */
@Service
public class UserService {
    public String getUserNameById(Integer id) {
        System.out.println("getUserNameById");
        return "xgBLACK";
    }

    public void deleteUserById(Integer id) {
        System.out.println("deleteUserById");
    }
}
