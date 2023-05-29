package com.example.userprovider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.feignapi.entity.Merchant;
import com.example.userprovider.mapper.ColonelMapper;
import com.example.userprovider.service.ColonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColonelServiceImpl extends ServiceImpl<ColonelMapper, Merchant> implements ColonelService {


    @Autowired
    private ColonelMapper colonelMapper;
    @Override
    public List<Merchant> findAll(){
        return colonelMapper.findAll();
    }



}
