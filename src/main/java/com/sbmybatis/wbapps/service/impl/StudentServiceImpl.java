package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.dao.StudentDao;
import com.sbmybatis.wbapps.entity.Student;
import com.sbmybatis.wbapps.service.interf.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional //开启事务
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    //插入一个学生
    public void addStudent(Student student){
        studentDao.save(student);
    }

    //修改一个学生(jpa是根据id来修改的)
    public void  updateStudent(Student student){
        studentDao.save(student);
    }
    //根据id删除一条数据
    public void deleteStudentById(Long id){
        studentDao.delete(id);
    }

    //查询所有
    public List<Student> findAll(){
        return studentDao.findAll();
    }
    //根据id查询一条数据(2.0后不能使用findOne了)
    public Student findStudentById(Long id){
        return studentDao.findOne(id);
    }
    //根据学生姓名查询多条数据
    public List<Student> findStudentByName(String name){
        return studentDao.findByName(name);
    }

}
