package com.jxh.service.impl;

import com.jxh.domain.Course;
import com.jxh.mapper.CourseMapper;
import com.jxh.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meizh
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseMapper.findById(id);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseMapper.deleteCourse(id);
    }

    @Override
    public List<Course> find() {
        return courseMapper.find();
    }
}
