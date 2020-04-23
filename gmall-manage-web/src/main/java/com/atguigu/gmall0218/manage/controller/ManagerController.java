package com.atguigu.gmall0218.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.*;
import com.atguigu.gmall0218.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ManagerController {
    @Reference
    private ManageService manageService;


    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatlog1(){

        return  manageService.getCatalog1();
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        return manageService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        return manageService.getCatalog3(catalog2Id);
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<BaseAttrInfo> attrInfoList(String catalog3Id){
        return manageService.getAttrList(catalog3Id);
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public void saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
        // 调用服务层做保存方法
        manageService.saveAttrInfo(baseAttrInfo);
    }


   // @RequestMapping("getAttrValueList")
   // @ResponseBody
  //  public List<BaseAttrValue> getAttrValueList(String attrId){
  //      return manageService.getAttrValueList(attrId);
  //  }

     @RequestMapping("getAttrValueList")
     @ResponseBody
     public List<BaseAttrValue> getAttrValueList(String attrId){
         BaseAttrInfo baseAttrInfo=manageService.getAttrInfo(attrId);
         return baseAttrInfo.getAttrValueList();
      }






}
