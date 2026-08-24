package com.teamnative.backend.domain.auth.dto;

public record LoginResponse(
        String accessToken,
        String tokenType,
        String username
) {
}
