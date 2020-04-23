package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.*;

import java.util.List;

public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    List<BaseAttrValue> getAttrValueList(String attrId);


    BaseAttrInfo getAttrInfo(String attrId);
    //List<SpuInfo> getSpuList(String catalog3Id);
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

}
