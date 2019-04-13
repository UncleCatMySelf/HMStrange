package com.springboot_redis_example.controller;

import com.springboot_redis_example.entity.Student;
import com.springboot_redis_example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Author: zhangqihao
 * @Date: 2019/4/11 22:44
 * @Version 1.0
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Integer id){
        return studentService.selectStudentById(id);
    }

    @PostMapping("/student/add")
    public int insertStudent(Student student){
        return studentService.insertStudent(student);
    }
}
