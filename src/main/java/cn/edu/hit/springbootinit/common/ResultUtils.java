package cn.edu.hit.springbootinit.common;

/**
 * 返回工具类
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode 预定义的错误码
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code 自定义的错误码，没有提前预定义过
     * @param message 错误信息
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> error(int code, String message){
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     * @param errorCode 预定义的错误码
     * @param message 错误信息
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
