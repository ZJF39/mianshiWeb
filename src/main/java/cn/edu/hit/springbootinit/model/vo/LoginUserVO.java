package cn.edu.hit.springbootinit.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户视图（脱敏）
 */
@Data
public class LoginUserVO implements Serializable {

    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    private String userAvatar;

    private String userProfile;

    /**
     * 角色：user/admin/ban
     */
    private String userRole;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
