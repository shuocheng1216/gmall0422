package com.atguigu.gmall0218.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;

    public String getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    @Column
    private String headImg;
    @Column
    private String userLevel;
}

