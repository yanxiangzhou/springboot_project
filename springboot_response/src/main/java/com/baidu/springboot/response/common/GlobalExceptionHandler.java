package com.baidu.springboot.response.common;

import com.baidu.springboot.response.utils.LoggerUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhangsan
 * @name GlobalExceptionHandler
 * @date 2025-05-10 20:44
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e) {
        // 日志记录（可选）
        LoggerUtils.error(e.getMessage(), e);
        return Result.fail(500, "Internal Server Error: " + e.getMessage());
    }
}

