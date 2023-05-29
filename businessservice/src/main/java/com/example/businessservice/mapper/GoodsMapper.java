package com.example.businessservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.feignapi.entity.Goods;
import org.apache.ibatis.annotations.*;


@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    //设置上架
    @Select("UPDATE `goods` SET put_shelf = 0 WHERE `id` = #{id}")
    Integer onSale(@Param("id") int gid);
    //设置下架
    @Update("UPDATE `goods` SET put_shelf = 1 WHERE `id` = #{id}")
    Integer stopSelling(@Param("id") int gid);
    //修改商品数量（补货）
    //能不能让数量进行增减
    @Insert("UPDATE `goods` SET total_quantity = #{num} WHERE `name` = #{name}")
    boolean setGoodsNum(@Param("num")String updateNum,@Param("name") String gName);
}
