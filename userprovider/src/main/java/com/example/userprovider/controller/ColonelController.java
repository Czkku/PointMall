package com.example.userprovider.controller;

import com.example.feignapi.entity.Merchant;
import com.example.userprovider.service.ColonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColonelController {
    @Autowired
    private ColonelService colonelService;

    @GetMapping("/findAll")
    public List<Merchant> findAll(){
        return colonelService.findAll();
    }
}
