package com.orange.orangepilotserver.converter;


import com.orange.orangepilotserver.model.entity.SysMenu;
import com.orange.orangepilotserver.model.form.MenuForm;
import com.orange.orangepilotserver.model.vo.MenuVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuConverter {

    MenuVO entity2Vo(SysMenu entity);

    MenuForm entity2Form(SysMenu entity);

    SysMenu form2Entity(MenuForm menuForm);

}