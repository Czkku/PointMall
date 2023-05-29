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
@TableName("withdraw_record")
public class WithdrawRecord {
    @TableField(value = "record_id")
    private int rid;
    //    @TableField(exist = false)  // 默认为true
//    private String name;
    @TableField(value = "user_id")
    private int uid;
    @TableField(value = "withdraw_id")
    private int wid;
    @TableField(value = "withdraw_amount")
    private int amount;
    @TableField(value = "withdraw_time")
    private String time;


}
