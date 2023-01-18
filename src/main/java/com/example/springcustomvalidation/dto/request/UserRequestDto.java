package com.example.springcustomvalidation.dto.request;

import com.example.springcustomvalidation.validation.annotations.TCKN;

import javax.validation.constraints.NotBlank;

public record UserRequestDto(
        @NotBlank
        String name,

        @TCKN
        String tckn
) {
}
