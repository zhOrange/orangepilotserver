package com.orange.orangepilotserver.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.orange.orangepilotserver.model.entity.SysUser;
import com.orange.orangepilotserver.model.form.UserForm;
import com.orange.orangepilotserver.model.dto.UserAuthInfo;
import com.orange.orangepilotserver.model.query.UserPageQuery;
import com.orange.orangepilotserver.model.vo.UserExportVO;
import com.orange.orangepilotserver.model.vo.UserInfoVO;
import com.orange.orangepilotserver.model.vo.UserPageVO;

import java.util.List;

/**
 * 用户业务接口
 *
 * @author haoxr
 * @since 2022/1/14
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 用户分页列表
     *
     * @return
     */
    IPage<UserPageVO> listPagedUsers(UserPageQuery queryParams);


    /**
     * 获取用户表单数据
     *
     * @param userId
     * @return
     */
    UserForm getUserFormData(Long userId);


    /**
     * 新增用户
     *
     * @param userForm 用户表单对象
     * @return
     */
    boolean saveUser(UserForm userForm);

    /**
     * 修改用户
     *
     * @param userId   用户ID
     * @param userForm 用户表单对象
     * @return
     */
    boolean updateUser(Long userId, UserForm userForm);


    /**
     * 删除用户
     *
     * @param idsStr 用户ID，多个以英文逗号(,)分割
     * @return
     */
    boolean deleteUsers(String idsStr);


    /**
     * 修改用户密码
     *
     * @param userId   用户ID
     * @param password 用户密码
     * @return
     */
    boolean updatePassword(Long userId, String password);

    /**
     * 根据用户名获取认证信息
     *
     * @param username 用户名
     * @return {@link UserAuthInfo}
     */

    UserAuthInfo getUserAuthInfo(String username);


    /**
     * 获取导出用户列表
     *
     * @param queryParams
     * @return
     */
    List<UserExportVO> listExportUsers(UserPageQuery queryParams);


    /**
     * 获取登录用户信息
     *
     * @return
     */
    UserInfoVO getCurrentUserInfo();
}
