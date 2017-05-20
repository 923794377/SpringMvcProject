package com.mvc.myproject.model;

/**
 * Created by Administrator on 2017/1/3.
 */

import javax.persistence.*;


@Entity
@Table(name = "baseUser", catalog = "spmvc")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BaseUser extends Model {
    private String userName;//用户姓名
    private String passWord;//用户密码


    @Column(name = "userName", nullable = true, insertable = true, updatable = true)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "passWord", nullable = true, insertable = true, updatable = true)
    public String getPassWord() {
        return passWord;
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



}
