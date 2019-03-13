package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Student;

import java.util.List;

public interface StudentService {
    default public void addStudent(Student student){

    }
    public void updateStudent(Student student);
    //根据id删除一条数据
    public void deleteStudentById(Long id);


    //查询所有
    public List<Student> findAll();
    //根据id查询一条数据(2.0后不能使用findOne了)
    public Student findStudentById(Long id);
    //根据学生姓名查询多条数据
    public List<Student> findStudentByName(String name);
}
