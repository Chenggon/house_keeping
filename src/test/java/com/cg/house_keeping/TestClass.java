package com.cg.house_keeping;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(value = SpringRunner.class)
public class TestClass {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("aaaaa", "aaaa");
        System.out.println(redisTemplate.opsForValue().get("aaaaa"));
    }
}
