package com.example.feignapi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//消费记录
@TableName("consume_record")
public class ConsumeRecord {
    @TableField(value = "record_id")
    private int rid;
//    @TableField(exist = false)  // 默认为true
//    private String name;
    @TableField(value = "user_id")
    private int uid;
    @TableField(value = "merchant_id")
    private int mid;
    @TableField(value = "consume_points")
    private int points;
    @TableField(value = "consume_time")
    private String consumetime;


}
