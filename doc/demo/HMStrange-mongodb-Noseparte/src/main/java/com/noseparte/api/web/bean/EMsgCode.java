package com.noseparte.api.web.bean;

public enum EMsgCode {
    success(80021),                // 成功
    error(90013),                //失败
    ;

    private EMsgCode(int code) {
        this.code = code;
    }

    public int code;

}
