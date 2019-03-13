package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Student;
import com.sbmybatis.wbapps.entity.Test;
import com.sbmybatis.wbapps.entity.UserInfo;
import com.sbmybatis.wbapps.service.interf.StudentService;
import com.sbmybatis.wbapps.service.interf.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserInfo userInfo;
    @Autowired
    private Test test;
    @Resource
    private UserInfoService userInfoService;

    /**
     * 获取所有用户
     *
     * @return
     */
    @GetMapping(value = "/getUserList")
    public List<UserInfo> getUserList() {
        return userInfoService.getUserList();
    }

    @GetMapping(value = "/getUserInfo")
    public UserInfo getUserInfoByName(@RequestParam("id") Long id) {
        return userInfoService.getUserByName(id);
    }

    @GetMapping(value = "/getCurrentUserList")
    public List<UserInfo> getCurrentUserList() {
        return userInfoService.getCurrentUserList();
    }

    @GetMapping(value = "/getPageUserList")
    public Page<UserInfo> getPageUserList() {
        return userInfoService.getPageUserList();
    }

    @GetMapping(value = "/addUserInfo")
    public UserInfo addUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setCreateTime(new Date());
        userInfo.setId(1L);
        userInfo.setJobNumber("40");
        userInfo.setName("唐鸣泽");
        return userInfoService.addUserInfo(userInfo);
    }

    @PostMapping(value = "/updateUserInfo")
    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoService.updateUserInfoById(userInfo);
    }

    @PostMapping(value = "/deleteUserInfo")
    public void deleteUserInfo(@RequestParam("id") Long id) {
        userInfoService.deleteUserInfoById(id);
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));/*TimeZone时区，解决差8小时的问题*/
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping("/gia")
    public Test tesy() {
        LOGGER.info("aaa", test.toString());
        Map<String, Object> map = test.getMap();
        return test;
    }

    @Autowired
    private StudentService studentService;

    //添加一个学生
    @PostMapping(value = "/addStudent")
    public CommonResult addStudent(Student student) {
        CommonResult result = new CommonResult();
        try {
            studentService.addStudent(student);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //修改一个学生(jpa是根据id来修改的)
    @PutMapping(value = "/updateStudent")
    public CommonResult updateStudentById(Student student) {
        CommonResult result = new CommonResult();
        try {
            studentService.updateStudent(student);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //根据id删除一条数据
    @DeleteMapping(value = "/deleteStudent/{id}")
    public CommonResult deleteStudentById(@PathVariable(name = "id", required = true) Long id) {
        CommonResult result = new CommonResult();
        try {
            studentService.deleteStudentById(id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //查询所有
    @GetMapping(value = "/findAll")
    public CommonResult findAll() {
        CommonResult result = new CommonResult();
        try {
            List<Student> list = studentService.findAll();
            //将查询结果封装到CommonResult中
            result.setData(list);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //根据id查询一条数据(2.0后不能使用findOne了)
    @GetMapping(value = "/findStudentById/{id}")
    public CommonResult findStudentById(@PathVariable(name = "id") Long id) {
        CommonResult result = new CommonResult();
        try {
            Student student = studentService.findStudentById(id);
            //将查询结果封装到CommonResult中
            result.setData(student);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //根据学生姓名查询多条数据
    @GetMapping(value = "/findStudentByName")
    public CommonResult findStudentByName(String name) {
        CommonResult result = new CommonResult();
        try {
            List<Student> studentList = studentService.findStudentByName(name);
            //将查询结果封装到CommonResult中
            result.setData(studentList);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }

    }
}