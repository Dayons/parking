package com.example.parking.service.impl;

import com.example.parking.dto.UserResponseDto;
import com.example.parking.entity.User;
import com.example.parking.repo.UserRepo;
import com.example.parking.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;


    @Override
    public User create(UserResponseDto userResponseDto) {
        User user = new User();
        user.setGateNumber(userResponseDto.getGateNumber());

        return userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
        }


    @Override
    public void delete(Long id) {
        }
    }

