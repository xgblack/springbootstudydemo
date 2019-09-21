package cn.xgblack.mybatis.controller;

import cn.xgblack.mybatis.domain.Buser;
import cn.xgblack.mybatis.mapper.BuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/21 23:11
 * className: MybatisController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class MybatisController {

    @Autowired
    private BuserMapper mapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<Buser> queryBuserList(){
        List<Buser> users = mapper.queryBuserList();
        return users;
    }
}
