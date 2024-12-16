package cn.edu.hit.mianshiWeb.service;

import cn.edu.hit.mianshiWeb.model.dto.user.UserQueryRequest;
import cn.edu.hit.mianshiWeb.model.entity.User;
import cn.edu.hit.mianshiWeb.model.vo.LoginUserVO;
import cn.edu.hit.mianshiWeb.model.vo.UserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 账户
     * @param userPassword 密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 账户名
     * @param userPassword 密码
     * @param request
     * @return 脱敏后用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户信息（脱敏）
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户退出登录
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取当前登录用户
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);


    /**
     * 获取查询条件
     *
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 检查是否为管理员
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 检查是否为管理员
     * @param user
     * @return
     */
    boolean isAdmin(User user);

    /**
     * 获取用户信息（脱敏）
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取当前登录用户（允许处于未登录状态）
     * @param request
     * @return
     */
    User getLoginUserPermitNull(HttpServletRequest request);
}
