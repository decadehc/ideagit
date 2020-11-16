package com.itheima.service.impl;

import com.itheima.service.IUserService;
import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private IUserDao userDao ;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    @Override
    public void updateUser(User user) {
         userDao.updateUser(user);
    }
}
