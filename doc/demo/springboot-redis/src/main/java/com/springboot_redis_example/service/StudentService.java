package com.springboot_redis_example.service;

import com.springboot_redis_example.entity.Student;



/**
 * @Author: zhangqihao
 * @Date: 2019/4/11 20:52
 * @Version 1.0
 */
public interface StudentService {

    /*
     *查询数据
     */
    public Student selectStudentById(Integer id);
    //写入数据
    public int insertStudent(Student student);
    //更新数据
    public int updateStudent(Student student);
    //删除数据
    public int deleteStudent(Integer id);
}
