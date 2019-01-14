package com.sbmybatis.wbapps.dao;

import com.sbmybatis.wbapps.entity.User;
import org.springframework.stereotype.Component;

public interface UserDao {
    /**
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

}