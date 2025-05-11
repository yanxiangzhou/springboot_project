package com.baidu.springboot.response.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangsan
 * @name LoggerUtils
 * @date 2025-05-10 20:44
 */
public class LoggerUtils {
    
    private static final Logger logger = LoggerFactory.getLogger(LoggerUtils.class);

    private LoggerUtils() {
        // 私有构造方法，防止实例化
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void info(String format, Object... args) {
        logger.info(format, args);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void debug(String format, Object... args) {
        logger.debug(format, args);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void warn(String format, Object... args) {
        logger.warn(format, args);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void error(String format, Object... args) {
        logger.error(format, args);
    }

    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }
}
