package com.sbmybatis.wbapps.respository;


import com.sbmybatis.wbapps.entity.Classifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ClassificationsRepository extends JpaRepository<Classifications,String>, JpaSpecificationExecutor<Classifications> {
    public List<Classifications> getAllByNumberIn(String[] num);
}
