package com.orange.orangepilotserver.model.bo;

import lombok.Data;

import java.util.Set;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 22:07
 */
@Data
public class RolePermsBO {
    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 权限标识集合
     */
    private Set<String> perms;

}
