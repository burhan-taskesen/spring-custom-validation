package com.example.springcustomvalidation.service.concretes;

import com.example.springcustomvalidation.dto.request.UserRequestDto;
import com.example.springcustomvalidation.dto.response.UserResponseDto;
import com.example.springcustomvalidation.exception.exceptions.UserAlreadyExistException;
import com.example.springcustomvalidation.mapper.UserMapper;
import com.example.springcustomvalidation.repository.UserRepository;
import com.example.springcustomvalidation.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        return userRepository.save(userMapper.toEntity(userRequestDto)).map(userMapper::toResponseDto)
                .orElseThrow(
                        () -> new UserAlreadyExistException("Bu tckn ile kayıtlı kullanıcı zaten var.")
                );
    }
}
