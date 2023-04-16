package com.jxh.mapper;

import com.jxh.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author meizh
 */
@Mapper
//识别他为mybatis的mapper接口，会自动的把 加@Mapper 注解的接口生成动态代理类。
//让springboot认识你的mapper层，也可以在启动类上面加MapperScan("mapper层所在包的全名")
public interface StudentMapper {
//    /**
//     * 查询所有学生信息
//     */
//    List<Student> findAll();
//
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

    /**
     * 查询学生及其课程名
     */
    List<Student> findAll();
}
