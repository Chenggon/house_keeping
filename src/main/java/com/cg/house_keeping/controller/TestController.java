package com.cg.house_keeping.controller;

import com.cg.house_keeping.dao.OrderLocationRepository;
import com.cg.house_keeping.model.po.OrderLocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {
    @Autowired
    private OrderLocationRepository orderLocationRepository;


    @RequestMapping("/test")
    @ResponseBody
    public List<OrderLocationEntity> test() {
        orderLocationRepository.findAll();
        return orderLocationRepository.queryNeary(116.420723f, 40.001221f, 1, 0, 10);
    }
}
