package com.atguigu.springcloud.entities;

import lombok.Data;

/**
 * @Author libingbing
 * @Date 2020-05-10 22:56
 * @Description 返回类
 */
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult() {
    }

}