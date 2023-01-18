package com.example.springcustomvalidation.mapper;

import com.example.springcustomvalidation.dto.request.UserRequestDto;
import com.example.springcustomvalidation.dto.response.UserResponseDto;
import com.example.springcustomvalidation.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto toResponseDto(User user){
        return new UserResponseDto(
                user.getName(),
                user.getTckn()
        );
    }

    public User toEntity(UserRequestDto userRequestDto){
        return userRequestDto == null ? null : new User(
                userRequestDto.name(),
                userRequestDto.tckn()
        );
    }
}
