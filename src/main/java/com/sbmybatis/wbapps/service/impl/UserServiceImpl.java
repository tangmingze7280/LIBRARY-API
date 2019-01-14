package com.sbmybatis.wbapps.service.impl;


import com.sbmybatis.wbapps.dao.UserDao;
import com.sbmybatis.wbapps.entity.User;
import com.sbmybatis.wbapps.service.interf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
       return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(User record) {
        return false;
    }
}
