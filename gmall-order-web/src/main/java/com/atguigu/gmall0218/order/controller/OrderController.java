package com.atguigu.gmall0218.order.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

   // @RequestMapping("trade")
  //  public String trade(){

  //      return "index";
   // }
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    @ResponseBody
     public List<UserAddress> trade(String userId){

          return userService.getUserAddressList(userId);
     }
}
