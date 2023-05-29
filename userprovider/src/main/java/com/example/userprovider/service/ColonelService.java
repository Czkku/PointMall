package com.example.userprovider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.entity.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ColonelService extends IService<Merchant> {
    List<Merchant> findAll();

}
