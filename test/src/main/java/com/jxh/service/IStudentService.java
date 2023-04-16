package com.jxh.service;

import com.jxh.domain.Student;

import java.util.List;

/**
 * @author meizh
 */
public interface IStudentService {
    /**
     * 查询所有学生信息
     */
    List<Student> findAll();

//    /**
//     * 根据id查询学生信息
//     */
//    Student findById(Long id);
//
//    /**
//     * 添加学生信息
//     */
//    void addStudent(Student student);
//
//    /**
//     * 修改学生信息
//     */
//    void updateStudent(Student student);
//
//    /**
//     * 根据id删除学生信息
//     */
//    void deleteStudent(Long id);
}
