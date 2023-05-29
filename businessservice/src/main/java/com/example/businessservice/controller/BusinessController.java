package com.example.businessservice.controller;

import com.example.businessservice.mapper.GoodsMapper;
import com.example.businessservice.mapper.TradesMapper;
import com.example.businessservice.service.GoodsService;
import com.example.feignapi.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BusinessController {
    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private TradesMapper tradesMapper;

    //上架
    @GetMapping("/onSale/{gid}")
    public boolean onSale(@PathVariable int gid){
        goodsService.onSale(gid);
        return true;
    }
    //下架
    @GetMapping("/stopSellign/{gid}")
    public boolean stopSelling(@PathVariable int gid){
        goodsService.stopSelling(gid);
        return true;
    }
    //补货
    @PostMapping("/setGoodsNum")
    public boolean setGoodsNum(@RequestBody String updateNum, String gName){
        goodsMapper.setGoodsNum(updateNum, gName);
        return true;
    }
    //打印所有订单汇总
    @GetMapping("/printTrades")
                  //   秒 分 时 当月哪天 月 周
                  //  {秒数} {分钟} {小时} {日期} {月份} {星期} {年份(可为空)}
    @Scheduled(cron = "0 0 22 ? * *") //每天晚上22点整触发
    public List<Trade> printTrades(){
        return tradesMapper.printTrades();
    }
/**
 * *表示每 ？表示不需要管
 "0/5 * *  * * ?"   每5秒触发
 "0 0 12 * * ?"    每天中午十二点触发
 "0 15 10 ? * *"    每天早上10：15触发
 "0 15 10 * * ?"    每天早上10：15触发
 "0 15 10 * * ? *"    每天早上10：15触发
 "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
 "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
 "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
 "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
 "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
 "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
 "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
 */
}
