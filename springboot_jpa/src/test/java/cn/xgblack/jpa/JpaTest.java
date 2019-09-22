package cn.xgblack.jpa;

import cn.xgblack.jpa.domain.Buser;
import cn.xgblack.jpa.repository.BuserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/22 10:19
 * className: JpaTest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {

    @Autowired
    private BuserRepository repository;

    @Test
    public void findAll(){
        List<Buser> users = repository.findAll();
        System.out.println(users);
    }
}
