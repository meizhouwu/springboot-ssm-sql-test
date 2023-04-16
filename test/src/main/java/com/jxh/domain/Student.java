package com.jxh.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author meizh
 * 学生类
 */
@Data
public class Student {
    private Long id;
    private String name;
    private String sn;
    private Integer gender;
    private Integer age;
    private String phone;
    private String address;
    private String email;
    private Long course_id;
    private Date create_time;

    private Course course;
}
