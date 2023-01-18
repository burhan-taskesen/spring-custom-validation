package com.example.springcustomvalidation.service.abstracts;

import com.example.springcustomvalidation.dto.request.UserRequestDto;
import com.example.springcustomvalidation.dto.response.UserResponseDto;

public interface UserService {
    UserResponseDto save(UserRequestDto userRequestDto);
}
