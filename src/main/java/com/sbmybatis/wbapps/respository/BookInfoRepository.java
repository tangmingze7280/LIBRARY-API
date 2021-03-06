package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.BookInfo;
import com.sbmybatis.wbapps.entity.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 * JpaSpecificationExecutor<T></>多表查询
 */
@Transactional
public interface BookInfoRepository extends JpaRepository<BookInfo,Long> , JpaSpecificationExecutor<BookInfo> {

}
