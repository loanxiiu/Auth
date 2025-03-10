package com.loanxiiu.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.loanxiiu.identityservice.dto.request.RoleRequest;
import com.loanxiiu.identityservice.dto.response.RoleResponse;
import com.loanxiiu.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
