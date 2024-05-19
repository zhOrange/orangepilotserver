package com.orange.orangepilotserver.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.orange.orangepilotserver.model.entity.SysDict;
import com.orange.orangepilotserver.model.form.DictForm;
import com.orange.orangepilotserver.model.vo.DictPageVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DictConverter {

    Page<DictPageVO> entity2Page(Page<SysDict> page);

    DictForm entity2Form(SysDict entity);

    @InheritInverseConfiguration(name="entity2Form")
    SysDict form2Entity(DictForm entity);
}
