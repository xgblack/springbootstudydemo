package cn.xgblack.mybatis;

import cn.xgblack.mybatis.domain.Buser;
import cn.xgblack.mybatis.mapper.BuserMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/22 10:29
 * className: RedisTest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private BuserMapper mapper;
    @Test
    public void find() throws JsonProcessingException {
        //从Redis中获得数据  数据的形式一般使用json字符串
        String listJson = redisTemplate.boundValueOps("user.findAll").get();
        //判断Redis是否存在这个数据
        if (null == listJson) {
            //如果不存在，从数据库查询
            List<Buser> users = mapper.queryBuserList();
            //将查询出的数据存储到Redis缓存中
            //将list集合转换成json
            ObjectMapper objectMapper = new ObjectMapper();
            listJson = objectMapper.writeValueAsString(users);

            redisTemplate.boundValueOps("user.findAll").set(listJson);
            System.out.println("===========从数据库中获得数据============");
        } else {
            System.out.println("===========从Redis缓存中获得数据============");
        }
        //将要返回的数据打印
        System.out.println(listJson);
    }
}
