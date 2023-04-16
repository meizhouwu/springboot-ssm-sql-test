package com.jxh.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author meizh
 */
@Data
public class Course {
    private Long id;
    private String name;
    private Long teacher_id;
    private String address;
    private Date create_time;
    private String note;

    private Teacher teacher;
}
