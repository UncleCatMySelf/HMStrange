package com.myself.mybatis.service.impl;

import com.myself.mybatis.entity.TMsg;
import com.myself.mybatis.mapper.TMsgMapper;
import com.myself.mybatis.service.TMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MySelf on 2019/4/9.
 */
@Service
public class TMsgServiceImpl implements TMsgService {

    @Autowired
    private TMsgMapper tMsgMapper;

    @Override
    public TMsg findById(Integer id) {
        return tMsgMapper.findById(id);
    }
}
