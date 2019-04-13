package com.myself.mybatis.mapper;

import com.myself.mybatis.entity.TMsg;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by MySelf on 2019/4/9.
 */
@Mapper
public interface TMsgMapper {

    public TMsg findById(Integer id);

}
