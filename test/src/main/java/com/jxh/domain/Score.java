package com.jxh.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author meizh
 */
@Data
public class Score {
    private Long id;
    private Long student_id;
    private Long course_id;
    private Integer score;
    private Date create_time;
    private Date update_time;
    private String note;

    private Student student;

    private Course course;

}
