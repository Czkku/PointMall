package com.example.userconsumer.controller;

import com.example.feignapi.utlis.Result;
import com.example.userconsumer.service.ColonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;

@RestController
public class ColonelController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ColonelService colonelService;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("from")
    public String fromA(){
        return "consumer远程调用provier："+this.restTemplate.getForObject("http://userprovider/from", String.class);
    }

    @GetMapping("/list")
    public Result findAll(){
        return  Result.ok(colonelService.findAll());
    }


}
