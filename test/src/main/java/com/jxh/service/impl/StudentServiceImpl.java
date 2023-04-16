package com.jxh.service.impl;

import com.jxh.domain.Student;
import com.jxh.mapper.StudentMapper;
import com.jxh.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meizh
 * 实现类
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

//    @Override
//    public Student findById(Long id) {
//        return studentMapper.findById(id);
//    }
//
//    @Override
//    public void addStudent(Student student) {
//        studentMapper.addStudent(student);
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//        studentMapper.updateStudent(student);
//    }
//
//    @Override
//    public void deleteStudent(Long id) {
//        studentMapper.deleteStudent(id);
//    }
}
