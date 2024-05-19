package com.orange.orangepilotserver.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 22:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleMenu  {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}