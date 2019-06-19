package com.shineyue.model;

public class Student {
    /**
     * 主键 t_id
     */
    private String t_id;

    /**
     * 姓名 t_name
     */
    private String t_name;

    /**
     * 年龄 t_age
     */
    private Short t_age;

    /**
     * 性别：0女1男2其他 t_sex
     */
    private String t_sex;

    /**
     * 所属班级 t_team_id
     */
    private String t_team_id;

    /**
     * 状态 t_status
     */
    private Short t_status;

    /**
     * 主键
     * @author lenovo
     * @return t_id 主键
     */
    public String getT_id() {
        return t_id;
    }

    /**
     * 主键
     * @author lenovo
     * @param t_id 主键
     */
    public void setT_id(String t_id) {
        this.t_id = t_id == null ? null : t_id.trim();
    }

    /**
     * 姓名
     * @author lenovo
     * @return t_name 姓名
     */
    public String getT_name() {
        return t_name;
    }

    /**
     * 姓名
     * @author lenovo
     * @param t_name 姓名
     */
    public void setT_name(String t_name) {
        this.t_name = t_name == null ? null : t_name.trim();
    }

    /**
     * 年龄
     * @author lenovo
     * @return t_age 年龄
     */
    public Short getT_age() {
        return t_age;
    }

    /**
     * 年龄
     * @author lenovo
     * @param t_age 年龄
     */
    public void setT_age(Short t_age) {
        this.t_age = t_age;
    }

    /**
     * 性别：0女1男2其他
     * @author lenovo
     * @return t_sex 性别：0女1男2其他
     */
    public String getT_sex() {
        return t_sex;
    }

    /**
     * 性别：0女1男2其他
     * @author lenovo
     * @param t_sex 性别：0女1男2其他
     */
    public void setT_sex(String t_sex) {
        this.t_sex = t_sex == null ? null : t_sex.trim();
    }

    /**
     * 所属班级
     * @author lenovo
     * @return t_team_id 所属班级
     */
    public String getT_team_id() {
        return t_team_id;
    }

    /**
     * 所属班级
     * @author lenovo
     * @param t_team_id 所属班级
     */
    public void setT_team_id(String t_team_id) {
        this.t_team_id = t_team_id == null ? null : t_team_id.trim();
    }

    /**
     * 状态
     * @author lenovo
     * @return t_status 状态
     */
    public Short getT_status() {
        return t_status;
    }

    /**
     * 状态
     * @author lenovo
     * @param t_status 状态
     */
    public void setT_status(Short t_status) {
        this.t_status = t_status;
    }
}