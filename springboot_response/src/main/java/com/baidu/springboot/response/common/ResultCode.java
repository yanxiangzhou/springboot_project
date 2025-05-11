package com.baidu.springboot.response.common;

import lombok.Getter;

/**
 * @author zhangsan
 * @name ResultCode
 * @date 2025-05-10 20:43
 */
@Getter
public enum ResultCode {
    SUCCESS(200, "Success"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Server Error");

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
