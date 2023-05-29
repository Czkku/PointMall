package com.example.businessservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.businessservice.mapper.TradesMapper;
import com.example.businessservice.service.TradesService;

import com.example.feignapi.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TradesServiceImpl  {
    @Autowired
    private TradesMapper tradesMapper;

    @GetMapping("/printTrades")
    public List<Trade> printTrades(){
        return tradesMapper.printTrades();
    }

}
