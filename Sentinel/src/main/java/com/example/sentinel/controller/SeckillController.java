package com.example.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.sentinel.exception.InterfaceExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeckillController {

    @RequestMapping("/seckill")
    @SentinelResource(value = "seckill",blockHandlerClass = InterfaceExceptionHandler.class)
    public String seckill(int userId, int orderId) {
        return "秒杀成功";
    }

    @GetMapping("/doFindById/{id}")
    @SentinelResource(value="resource")
    public String doFindById(@PathVariable("id") Integer id){
        return "Get Resource By "+id;
    }

//    //http://localhost:8081/provider/doFindById?id=10
//    @GetMapping("/doFindById")
//    @SentinelResource(value="resource")
//    public String doFindById(@RequestParam Integer id){
//        return "Get Resource By "+id;
//    }
}
