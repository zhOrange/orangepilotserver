package com.orange.orangepilotserver.common.enums;

import com.orange.orangepilotserver.common.base.IBaseEnum;
import lombok.Getter;

public enum StatusEnum implements IBaseEnum<Integer> {

    ENABLE(1, "启用"),
    DISABLE (0, "禁用");

    @Getter
    private Integer value;

    @Getter
    private String label;

    StatusEnum(Integer value, String label) {
        this.value = value;
        this.label = label;
    }
}