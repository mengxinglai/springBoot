package com.shineyue.controller;

import com.shineyue.model.Student;
import com.shineyue.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author lenovo
 * @Date 2019/6/19 10:34
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 添加学生
     * @param student
     * @return
     */
    @RequestMapping(value = "/addStudent",method = RequestMethod.GET)
    public String addStudent(Student student){
        int i = studentService.addStudent(student);
        if(i>0){
            return "添加成功！";
        }
        return "添加失败！";
    }

    /**
     * 删除学生，直接删除
     * @param sId
     * @return
     */
    @RequestMapping(value = "/delStudent",method = RequestMethod.GET)
    public String delStudent(String sId){
        int i = studentService.delStudent(sId);
        if(i>0){
            return "删除student成功！";
        }
        return "删除student失败！";
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @RequestMapping(value = "/upStudent",method = RequestMethod.GET)
    public String upStudent(Student student){
        int i = studentService.upStudent(student);
        if(i>0){
            return "修改student信息成功！";
        }
        return "修改student信息失败!";
    }

    /**
     * 查询所有学生信息
     * @return
     */
    @RequestMapping(value = "/queryStudent")
    public List queryStudent(){
        return studentService.queryStudent();
    }
}
