package com.myself.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by MySelf on 2019/4/9.
 */
@Data
public class TMsg implements Serializable {

    private Integer id;

    private String message;

}
