package com.jxh.mapper;

import com.jxh.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author meizh
 */
@Mapper
public interface CourseMapper {

    /**
     * 查询所有课程信息
     */
    List<Course> findAll();

    /**
     * 根据id查询课程信息
     */
    Course findById(Long id);

    /**
     * 添加课程信息
     */
    void addCourse(Course course);

    /**
     * 修改课程信息
     */
    void updateCourse(Course course);

    /**
     * 根据id删除课程信息
     */
    void deleteCourse(Long id);


    /**
     * 查询课程及其老师
     */
    List<Course> find();

}
