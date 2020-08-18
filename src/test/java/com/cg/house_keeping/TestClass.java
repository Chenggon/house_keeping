package com.cg.house_keeping;


import com.cg.house_keeping.dao.OrderLocationRepository;
import com.cg.house_keeping.model.po.OrderLocationEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

@SpringBootTest
@RunWith(value = SpringRunner.class)
public class TestClass {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private OrderLocationRepository orderLocationRepository;

    @Test
    public void test() {
//        redisTemplate.opsForValue().set("aaaaa", "aaaa");
//        System.out.println(redisTemplate.opsForValue().get("aaaaa"));
for (int i= 0;i<100;i++){
   // System.out.println( new Random().nextDouble());
    DecimalFormat dcmFmt = new DecimalFormat("0.000000");
    System.out.println(dcmFmt.format(new Random().nextInt(180)+new Random().nextDouble()));
}

    }

    @Test
    public void test01() {
//        List<OrderLocationEntity> orderLocationEntities = orderLocationRepository.queryNeary(40.001221f, 116.420723f, 1, 0, 10);
//        System.out.println(orderLocationEntities.size());
        DecimalFormat dcmFmt = new DecimalFormat("0.000000");
        for (int i = 1000000; i < 3000000; i++) {
            OrderLocationEntity orderLocationEntity = new OrderLocationEntity();

            double lat = Double.parseDouble(dcmFmt.format(new Random().nextInt(180)+new Random().nextDouble()));
            double lng = Double.parseDouble(dcmFmt.format(new Random().nextInt(180)+new Random().nextDouble()));
            orderLocationEntity.setOrderNo(Integer.valueOf(i).longValue());
            orderLocationEntity.setLat(lat);
            orderLocationEntity.setLng(lng);
            orderLocationRepository.save(orderLocationEntity);
            System.out.println("插入第"+i+"条数据");
        }

    }
}
