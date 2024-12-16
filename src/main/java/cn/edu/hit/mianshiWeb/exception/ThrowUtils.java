package cn.edu.hit.mianshiWeb.exception;

import cn.edu.hit.mianshiWeb.common.ErrorCode;

/**
 * 抛异常工具类
 * 当需要在业务逻辑中进行条件判断，并且条件不满足时需要抛出异常时，可以使用 ThrowUtils。
 * 例如，在验证参数有效性时，如果参数不符合要求，可以使用 throwIf 方法抛出异常。
 */
public class ThrowUtils {

    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
