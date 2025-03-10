package com.loanxiiu.identityservice.mapper;

import org.mapstruct.Mapper;

import com.loanxiiu.identityservice.dto.request.PermissionRequest;
import com.loanxiiu.identityservice.dto.response.PermissionResponse;
import com.loanxiiu.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
