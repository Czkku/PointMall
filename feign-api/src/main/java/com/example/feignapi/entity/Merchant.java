package com.example.feignapi.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Merchant {
    @TableField(value = "merchant_id")
    private int mid;
    @TableField(value = "merchant_name")
    private String mname;
    @TableField(value = "contact_person")
    private String person;
    private String phone;
    private String email;
    private String address;
    private String createtime;
    private String status;

}
