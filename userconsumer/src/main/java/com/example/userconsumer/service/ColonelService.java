package com.example.userconsumer.service;


import com.example.feignapi.controller.LogConfiguration;
import com.example.feignapi.entity.Merchant;
import com.example.userconsumer.service.Impl.ColonelServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FeignClient(value = "userprovider",configuration = LogConfiguration.class,fallback = ColonelServiceImpl.class)
public interface ColonelService {
    List<Merchant> findAll();
    //上架功能

}
