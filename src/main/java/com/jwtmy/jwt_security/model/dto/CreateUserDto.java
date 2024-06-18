package com.jwtmy.jwt_security.model.dto;

import com.jwtmy.jwt_security.constants.RoleName;

public record CreateUserDto(

        String email,
        String password,
        RoleName role

) {
}
