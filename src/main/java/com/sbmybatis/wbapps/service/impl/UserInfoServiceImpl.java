package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.UserInfo;
import com.sbmybatis.wbapps.respository.UserRepository;
import com.sbmybatis.wbapps.service.interf.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserRepository userRepository;

    /**
     * 获取所有用户列表
     * @return
     */
    public List<UserInfo> getUserList(){
        List<UserInfo> userList=new ArrayList<>();
        userList=userRepository.findAll();
        return  userList;
    }

    /**
     * 通过ID获取用户信息
     * @param  id
     * @return
     */
    public UserInfo getUserByName(Long id) {
        return userRepository.findOne(id);
    }

    /**
     * 新增用户信息
     * @param userInfo 用户信息
     * @return
     */
    public UserInfo addUserInfo(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return
     */
    public UserInfo updateUserInfoById(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    /**
     * 删除用户信息
     * @param id 主键Id
     */
    public void deleteUserInfoById(Long id) {
        userRepository.delete(id);
    }

    /**
     * 获取最新的用户
     * @return
     */
    public List<UserInfo> getCurrentUserList() {
        Sort sort=new Sort(Sort.Direction.DESC,"createTime");
        return userRepository.findAll(sort);

    }

    /**
     * 获取分页的用户
     * @return
     */
    public Page<UserInfo> getPageUserList() {
        Sort sort=new Sort(Sort.Direction.DESC,"createTime");
        Pageable pageable=new PageRequest(0,5,sort);
        return userRepository.findAll(pageable);
    }
}
