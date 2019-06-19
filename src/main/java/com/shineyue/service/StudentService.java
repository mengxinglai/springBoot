package com.shineyue.service;

import com.shineyue.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 删除学生
     * @param sId
     * @return
     */
    int delStudent(String sId);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int upStudent(Student student);

    /**
     * 查询学生信息
     * @return
     */
    List<Student> queryStudent();
}
