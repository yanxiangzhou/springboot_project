package com.baidu.springboot.response.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangsan
 * @name Result
 * @date 2025-05-10 20:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    // 状态码
    private int code;
    // 提示信息
    private String message;
    // 返回的数据
    private T data;

    // 成功返回
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "Success", data);
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    // 失败返回
    public static <T> Result<T> fail(int code, String message) {
        return new Result<>(code, message, null);
    }
}

