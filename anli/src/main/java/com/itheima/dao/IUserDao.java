package com.itheima.dao;


import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {

    // 查询用户的列表
    @Select("select * from user")
    List<User> findAll() ;

    // 根据用户的id进行的查询
    @Select("select * from user where id = #{userId}")
    User findById(Integer userId);

    //修改
    @Update("update user set username = #{username} , password = #{password} , age = #{age} , email=#{email} where id= #{id}")
    void updateUser(User user);




}
