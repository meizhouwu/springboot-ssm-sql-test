package com.jxh.domain;

import lombok.Data;

import java.util.Date;



/**
 * @author meizh
 */
@Data
public class Teacher {
    private Long id;
    private String name;
    private Integer gender;
    private String phone;
    private String email;
    private Date create_time;
}
