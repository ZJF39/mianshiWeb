package cn.edu.hit.mianshiWeb.model.dto.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1475151120812915023L;

    private String userAccount;

    private String userPassword;
}
