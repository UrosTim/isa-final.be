package com.isa.projectfinal.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseModel {
    private String token;
    private String refreshToken;
}
