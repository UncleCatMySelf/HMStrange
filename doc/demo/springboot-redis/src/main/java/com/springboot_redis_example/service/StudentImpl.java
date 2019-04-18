package com.springboot_redis_example.service;

import com.springboot_redis_example.entity.Student;
import com.springboot_redis_example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangqihao
 * @Date: 2019/4/11 21:18
 * @Version 1.0
 */
@Service("StudentService")
public class StudentImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生信息
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "user",key = "#id")
    public Student selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    /**
     * 新增学生信息
     * @param student
     * @return
     */
    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    /**
     * 更新用户信息
     * @param student
     * @return
     */
    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @Override
    public int deleteStudent(Integer id) {
        return studentMapper.deleteStudentById(id);
    }
}
