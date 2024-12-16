package cn.edu.hit.mianshiWeb.exception;

import cn.edu.hit.mianshiWeb.common.ErrorCode;

/**
 * 自定义异常类
 * 用于表示业务逻辑中的异常情况，提供错误码和错误信息。
 */
public class BusinessException extends RuntimeException{

    /**
     * 错误码
     */
    private final int code;


    public BusinessException(int code,String message){
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
