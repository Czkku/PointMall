package com.example.businessservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.entity.Trade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TradesService extends IService<Trade> {

    //打印所有订单汇总 gateway设定after某时间后才可执行（连表查询order_details）
    List<Trade> printTrades();

}
