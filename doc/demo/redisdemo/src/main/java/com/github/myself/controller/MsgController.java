package com.github.myself.controller;

import com.github.myself.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MySelf on 2019/4/11.
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @GetMapping("/set")
    public String setMsg(@RequestParam(value = "key") String key,@RequestParam(value = "msg") String msg){
        return msgService.setMsg(key,msg);
    }

    @GetMapping("/get")
    public String getMsg(@RequestParam(value = "key") String key){
        return msgService.getMsg(key);
    }

}
