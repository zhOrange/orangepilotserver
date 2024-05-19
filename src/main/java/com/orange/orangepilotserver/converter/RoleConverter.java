package com.orange.orangepilotserver.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.orange.orangepilotserver.common.model.Option;
import com.orange.orangepilotserver.model.entity.SysRole;
import com.orange.orangepilotserver.model.form.RoleForm;
import com.orange.orangepilotserver.model.vo.RolePageVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface RoleConverter {

    Page<RolePageVO> entity2Page(Page<SysRole> page);

    @Mappings({
            @Mapping(target = "value", source = "id"),
            @Mapping(target = "label", source = "name")
    })
    Option entity2Option(SysRole role);


    List<Option> entities2Options(List<SysRole> roles);

    SysRole form2Entity(RoleForm roleForm);

    RoleForm entity2Form(SysRole entity);
}