package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.UserInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserList();
    UserInfo getUserByName(Long id);
    UserInfo addUserInfo(UserInfo userInfo);
    UserInfo updateUserInfoById(UserInfo userInfo);
    void deleteUserInfoById(Long Id);
    List<UserInfo>getCurrentUserList();
    Page<UserInfo> getPageUserList();
}
