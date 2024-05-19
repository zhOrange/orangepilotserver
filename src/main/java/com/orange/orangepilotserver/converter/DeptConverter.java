package com.orange.orangepilotserver.converter;

import com.orange.orangepilotserver.model.entity.SysDept;
import com.orange.orangepilotserver.model.form.DeptForm;
import com.orange.orangepilotserver.model.vo.DeptVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeptConverter {

    DeptForm entity2Form(SysDept entity);
    DeptVO entity2Vo(SysDept entity);

    SysDept form2Entity(DeptForm deptForm);

}