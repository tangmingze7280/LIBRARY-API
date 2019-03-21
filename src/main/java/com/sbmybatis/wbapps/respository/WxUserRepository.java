package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.UserInfo;
import com.sbmybatis.wbapps.entity.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 */
public interface WxUserRepository extends JpaRepository<WxUser,Long> {
    WxUser findWxUserByWxCode(String wxCode);
}
