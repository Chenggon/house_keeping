package com.cg.house_keeping;


import com.cg.house_keeping.dao.OrderLocationRepository;
import com.cg.house_keeping.model.po.OrderLocationEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(value = SpringRunner.class)
public class TestClass {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private OrderLocationRepository orderLocationRepository;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("aaaaa", "aaaa");
        System.out.println(redisTemplate.opsForValue().get("aaaaa"));
    }

    @Test
    public void test01(){
        List<OrderLocationEntity> orderLocationEntities = orderLocationRepository.queryNeary(40.001221f, 116.420723f, 1, 0, 10);
        System.out.println(orderLocationEntities.size());

    }
}
