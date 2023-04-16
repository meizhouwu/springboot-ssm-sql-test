package com.jxh.controller;

import com.jxh.domain.Student;
import com.jxh.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author meizh
 */
@Controller
@RequestMapping("/student")
@ResponseBody
public class StudentController {

    @Autowired
    private IStudentService studentService;


    @GetMapping("/findall")
    public List<Student> findAll() {
        return studentService.findAll();
    }


//    @GetMapping ("/findbyid")
//    public Student findOne(Long id) {
//        return studentService.findById(id);
//    }
//
//
//    @PutMapping("/save")
//    public AjaxResult save(Student student){
//        try {
//            if(student.getId() == null){//添加
//                studentService.addStudent(student);
//            }else{
//                studentService.updateStudent(student);
//            }
//            return new AjaxResult();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new AjaxResult(false,"操作失败");
//        }
//    }
//
//    @DeleteMapping("/delete")
//    public AjaxResult del(Long id){
//        try {
//            studentService.deleteStudent(id);
//            return new AjaxResult();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new AjaxResult(false,"操作失败");
//        }
//    }
}
