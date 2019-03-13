package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.entity.Student;
import com.sbmybatis.wbapps.service.interf.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyWXController {
    @Autowired(required = false)
    StudentService studentService;
    @PostMapping("/hello")
    public Student getStudent(){

        return studentService.findStudentById(1L);
    }
}
