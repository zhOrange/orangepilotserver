package com.orange.orangepilotserver.common.base;

import lombok.Data;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 20:24
 */
@Data
@ToString
public class BaseVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
