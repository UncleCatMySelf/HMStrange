package com.noseparte.api.web.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseResult {
    private int status;
    private String msg = "";
    private int msgCode;
    private Object result;

    @Data
    public static class ShareResult {
        int energy;
    }
}

