package com.mvc.myproject.repository;

import com.mvc.myproject.model.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/1/3.
 */

@Repository
public interface UserQuerys extends JpaRepository<BaseUser, String> {

    @Modifying // 说明该方法是修改操作
    @Transactional // 说明该方法是事务性操作
    // @Param注解用于提取参数
    @Query("update BaseUser us set us.userName=:userName,us.passWord=:passWord where us.id=:id")
    void updateUserPhone(@Param("userName") String userName,
                         @Param("passWord") String passWord,
                         @Param("id") String id);
}
