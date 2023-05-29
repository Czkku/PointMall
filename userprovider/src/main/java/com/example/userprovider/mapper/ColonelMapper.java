package com.example.userprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.feignapi.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ColonelMapper extends BaseMapper<Merchant> {

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("colonel_id,id,`name`,username,address from customer WHERE colonel_id=#{id}")
    List<Merchant> findAll();
}
