package com.orange.orangepilotserver.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.orange.orangepilotserver.model.entity.SysDictType;
import com.orange.orangepilotserver.model.form.DictTypeForm;
import com.orange.orangepilotserver.model.vo.DictTypePageVO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface DictTypeConverter {

    Page<DictTypePageVO> entity2Page(Page<SysDictType> page);

    DictTypeForm entity2Form(SysDictType entity);

    SysDictType form2Entity(DictTypeForm entity);
}
