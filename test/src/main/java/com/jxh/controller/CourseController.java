package com.jxh.controller;

import com.jxh.domain.Course;
import com.jxh.service.ICourseService;
import com.jxh.until.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author meizh
 */
@Controller
@RequestMapping("/course")
@ResponseBody
public class CourseController {

    @Autowired
    private ICourseService courseService;


    @GetMapping("/findall")
    public List<Course> findAll() {
        return courseService.findAll();
    }


    @GetMapping ("/findbyid")
    public Course findOne(Long id) {
        return courseService.findById(id);
    }


    @PutMapping("/save")
    public AjaxResult save(Course course){
        try {
            if(course.getId() == null){//添加
                course.setCreate_time(new Date());
                courseService.addCourse(course);
            }else{
                courseService.updateCourse(course);
            }
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false,"操作失败");
        }
    }

    @DeleteMapping("/delete")
    public AjaxResult del(Long id){
        try {
            courseService.deleteCourse(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false,"操作失败");
        }
    }


    @GetMapping("/find")
    public List<Course> find() {
        return courseService.find();
    }

}
