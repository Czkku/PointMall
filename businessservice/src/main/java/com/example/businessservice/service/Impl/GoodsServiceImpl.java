package com.example.businessservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.businessservice.mapper.GoodsMapper;
import com.example.businessservice.service.GoodsService;
import com.example.feignapi.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;

    //上架
    @Override
    public boolean onSale(int gid){
        goodsMapper.onSale(gid);
        return true;
    }

    //下架
    @Override
    public boolean stopSelling(int gid){
        goodsMapper.stopSelling(gid);
        return true;
    };
    //补货
    @Override
    public boolean setGoodsNum(@RequestBody String updateNum, @RequestBody String gName){
        goodsMapper.setGoodsNum(updateNum, gName);
        return true;
    };
}
