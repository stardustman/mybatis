package com.stardust.mybatis.dao;

import java.util.List;

import com.stardust.mybatis.entity.User;



public interface UserDao {

    public void insert(User user);
    
    public User findUserById (int userId);
    
    public List<User> findAllUsers();
    
}