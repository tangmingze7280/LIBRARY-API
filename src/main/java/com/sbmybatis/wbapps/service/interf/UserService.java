package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.User;

public interface UserService {
    public User getUserById(Integer userId);

    boolean addUser(User record);
}
