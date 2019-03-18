package com.sbmybatis.wbapps.dao;

import com.sbmybatis.wbapps.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * JpaRepository<Student,Long>
 *     泛型   <实体类，主键类型></>
 *     由于Spring为我们封装了大量的方法，就特别简单
 *
 */

public interface StudentDao extends JpaRepository<Student,Long> {
    //根据学生姓名查询数据
    public List<Student> findByName(String name);

    @Query(value="select * from tb_student",nativeQuery = true)
    public List<Student> findOther(String name);
 /*   @Query(value="",nativeQuery = true)
    @Modifying
    public void updataAll();*/
}
