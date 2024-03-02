package com.example.parking.service;

import com.example.parking.dto.UserResponseDto;
import com.example.parking.entity.User;

import java.util.List;

public interface UserService {
    User create(UserResponseDto userResponseDto);
    List<User> findAll();
    User findById(Long id);
    void delete(Long id);

}
