package com.orange.orangepilotserver.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.orange.orangepilotserver.model.bo.UserBO;
import com.orange.orangepilotserver.model.entity.SysUser;
import com.orange.orangepilotserver.model.form.UserForm;
import com.orange.orangepilotserver.model.vo.UserImportVO;
import com.orange.orangepilotserver.model.vo.UserInfoVO;
import com.orange.orangepilotserver.model.vo.UserPageVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface UserConverter {

    @Mappings({
            @Mapping(target = "genderLabel", expression = "java(com.youlai.system.common.base.IBaseEnum.getLabelByValue(bo.getGender(), com.youlai.system.common.enums.GenderEnum.class))")
    })
    UserPageVO bo2PageVo(UserBO bo);

    Page<UserPageVO> bo2PageVo(Page<UserBO> bo);

    UserForm entity2Form(SysUser entity);

    @InheritInverseConfiguration(name = "entity2Form")
    SysUser form2Entity(UserForm entity);

    @Mappings({
            @Mapping(target = "userId", source = "id")
    })
    UserInfoVO toUserInfoVo(SysUser entity);

    SysUser importVo2Entity(UserImportVO vo);

}
