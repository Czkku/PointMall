package com.example.businessservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.entity.Goods;
import org.springframework.stereotype.Service;

@Service
public interface GoodsService extends IService<Goods> {
    //设置上架
    boolean onSale(int gid);
    //设置下架
    boolean stopSelling(int gid);
    //修改商品数量（通过id）
    boolean setGoodsNum(String updateNum,String gName);

}
