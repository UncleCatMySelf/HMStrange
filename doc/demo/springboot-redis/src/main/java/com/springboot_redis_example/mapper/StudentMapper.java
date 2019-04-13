package com.springboot_redis_example.mapper;

import com.springboot_redis_example.entity.Student;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author: zhangqihao
 * @Date: 2019/4/11 21:18
 * @Version 1.0
 */
@Mapper
public interface StudentMapper {
    /**
     * 查询用户管理信息
     */
    public Student selectStudentById(Integer id);

    /**
     * 新增用户管理
     *
     */
    public int insertStudent(Student student);

    /**
     * 修改用户管理
     *
     */
    public int updateStudent(Student student);

    /**
     * 删除用户管理
     *
     */
    public int deleteStudentById(Integer id);
}
