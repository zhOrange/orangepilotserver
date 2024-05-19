package com.orange.orangepilotserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.orange.orangepilotserver.model.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    /**
     * 获取角色绑定的用户数
     *
     * @param roleId 角色ID
     */
    int countUsersForRole(Long roleId);
}
