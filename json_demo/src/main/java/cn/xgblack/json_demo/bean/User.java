package cn.xgblack.json_demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author 小光
 * @date 2019/12/2 9:26
 * className: User
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String username;
    private String address;
    //@JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
