package com.anlu.model;

import java.util.Date;

public class student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.school
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.enter_time
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    private Date enterTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_num
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    private String stuNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.school
     *
     * @return the value of student.school
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.school
     *
     * @param school the value for student.school
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.enter_time
     *
     * @return the value of student.enter_time
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public Date getEnterTime() {
        return enterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.enter_time
     *
     * @param enterTime the value for student.enter_time
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_num
     *
     * @return the value of student.stu_num
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public String getStuNum() {
        return stuNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_num
     *
     * @param stuNum the value for student.stu_num
     *
     * @mbggenerated Thu May 25 15:12:17 CST 2017
     */
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
}