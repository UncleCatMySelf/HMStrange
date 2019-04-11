package com.github.myself.service.impl;

import com.github.myself.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by MySelf on 2019/4/11.
 */
@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String setMsg(String key,String msg) {
        redisTemplate.opsForValue().set(key,msg);
        return "success";
    }

    @Override
    public String getMsg(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
