package com.orange.orangepilotserver.common.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 20:23
 */
@Data
@Schema
public class BasePageQuery {
    @Schema(description = "页码", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private int pageNum = 1;

    @Schema(description = "每页记录数", requiredMode = Schema.RequiredMode.REQUIRED, example = "10")
    private int pageSize = 10;
}
