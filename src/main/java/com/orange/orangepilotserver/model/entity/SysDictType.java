package com.orange.orangepilotserver.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.orange.orangepilotserver.common.base.BaseEntity;
import lombok.Data;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 22:13
 */
@Data
public class SysDictType extends BaseEntity {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 类型编码
     */
    private String code;

    /**
     * 状态(0:正常;1:禁用)
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}