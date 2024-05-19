package com.orange.orangepilotserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.orange.orangepilotserver.model.bo.RouteBO;
import com.orange.orangepilotserver.model.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<RouteBO> listRoutes();

    /**
     * 获取角色权限集合
     *
     * @param roles
     * @return
     */
    Set<String> listRolePerms(Set<String> roles);
}