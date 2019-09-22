package cn.xgblack.mybatis;

import cn.xgblack.mybatis.domain.Buser;
import cn.xgblack.mybatis.mapper.BuserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/22 9:58
 * className: MybatisTest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MybatisTest {

    @Autowired
    private BuserMapper mapper;

    @Test
    public void test() {
        List<Buser> users = mapper.queryBuserList();
        System.out.println(users);
    }
}
