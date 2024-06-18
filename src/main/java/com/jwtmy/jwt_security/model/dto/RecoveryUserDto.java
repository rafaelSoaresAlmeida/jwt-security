package com.jwtmy.jwt_security.model.dto;

import com.jwtmy.jwt_security.model.entity.Role;

import java.util.List;

public record RecoveryUserDto(

        Long id,
        String email,
        List<Role> roles

) {
}