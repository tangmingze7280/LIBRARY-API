package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.UserInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 */
public interface UserRepository extends JpaRepository<UserInfo,Long> {
}
