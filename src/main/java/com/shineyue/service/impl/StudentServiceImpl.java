package com.shineyue.service.impl;

import com.shineyue.dao.StudentMapper;
import com.shineyue.model.Student;
import com.shineyue.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author lenovo
 * @Date 2019/6/19 10:30
 * @Version 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 添加学生
     * @param student
     * @return
     */
    @Override
    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }

    /**
     * 删除学生信息
     * @param sId
     * @return
     */
    @Override
    public int delStudent(String sId) {
        return studentMapper.deleteByPrimaryKey(sId);
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @Override
    public int upStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    /**
     * 查询所有学生信息
     * @return
     */
    @Override
    public List<Student> queryStudent() {
        return studentMapper.selectStudent();
    }
}
