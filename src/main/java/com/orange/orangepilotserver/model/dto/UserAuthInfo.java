package com.orange.orangepilotserver.model.dto;

import lombok.Data;

import java.util.Set;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 14:13
 */
@Data
public class UserAuthInfo {
    private Long userId;

    private String username;

    private String nickname;

    private Long deptId;

    private String password;

    private Integer status;

    private Set<String> roles;

    private Set<String> perms;

    private Integer dataScope;
}
