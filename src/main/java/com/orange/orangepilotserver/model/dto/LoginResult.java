package com.orange.orangepilotserver.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 22:10
 */
@Schema(description ="登录响应对象")
@Data
@Builder
public class LoginResult {

    @Schema(description = "访问token")
    private String accessToken;

    @Schema(description = "token 类型",example = "Bearer")
    private String tokenType;

    @Schema(description = "刷新token")
    private String refreshToken;

    @Schema(description = "过期时间(单位：毫秒)")
    private Long expires;

}
