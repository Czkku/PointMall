package com.example.feignapi.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("points_rule")
public class Rule {
//    // 用来解决数据库中的字段和实体类的字段不匹配问题
//    @TableField(value = "age")
//
//// 用来解决实体类中有的属性但是数据表中没有的字段
//    @TableField(exist = false)  // 默认为true
    @TableField(value = "rule_id")
    private int rid;
    private String level;
    @TableField(value = "min_amount")
    private String minamount;
    @TableField(value = "max_amount")
    private String maxamount;
    @TableField(value = "points_rate")
    private String rate;
    //升级所需等级
    @TableField(value = "upgrade_points")
    private String upgradepoints;


}
