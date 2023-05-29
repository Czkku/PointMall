package com.example.feignapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
//@FeignClient(name = "userprovider" ,path = "/user",fallback = UserClientImpl.class)
public interface UserClient {

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public Result add(@RequestBody col user);
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public Result updateUser(@RequestParam(value = "userId", required = true) int userId);
//
//    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
//    public Result delete(@RequestParam(value = "userId", required = true) int userId);
//
//    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
//    public Result findByUserName(@RequestParam(value = "userName", required = true) String userName);
//
//    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
//    public Result findAllUser();
//
//    @GetMapping("/findById/{id}")
//    public Result findById(@PathVariable("id") int id);


}
