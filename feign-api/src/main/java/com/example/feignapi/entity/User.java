package com.example.feignapi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
// 用来解决数据库中的字段和实体类的字段不匹配问题
//    @TableField(value = "age")
//
//// 用来解决实体类中有的属性但是数据表中没有的字段
//    @TableField(exist = false)  // 默认为true
    @TableField(value = "user_id")
    private int uid;
    private String username;
    private String phone;
    private String email;
    private String createtime;
    private String status;
    private String level;
    private String points;



}
