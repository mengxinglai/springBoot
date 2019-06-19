package com.shineyue.dao;

import com.shineyue.model.Student;

import java.util.List;

public interface StudentMapper {
    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    int deleteByPrimaryKey(String t_id);

    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    int insert(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    int insertSelective(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    Student selectByPrimaryKey(String t_id);

    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 20:08:00
     */
    int updateByPrimaryKey(Student record);
    List<Student> selectStudent();
}