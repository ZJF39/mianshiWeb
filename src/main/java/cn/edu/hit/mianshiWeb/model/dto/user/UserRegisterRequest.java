package cn.edu.hit.mianshiWeb.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 1602938296454393225L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
