package cn.edu.hit.mianshiWeb.constant;

/**
 * 用户常量
 */
public interface UserConstant {
    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    // region 权限

    /**
     * 默认权限
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员权限
     */
    String ADMIN_ROLE = "admin";

    /**
     * 封禁
     */
    String BAN_ROLE = "ban";
    // endregion
}