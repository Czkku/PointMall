package com.example.businessservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.feignapi.entity.Trade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TradesMapper extends BaseMapper<Trade> {
    /**
     * 根据用户名称查询用户信息
     *
     */
//    @Select("colonel_id,id,`name`,username,address from customer WHERE colonel_id=#{id}")
    List<Trade> printTrades();

}
