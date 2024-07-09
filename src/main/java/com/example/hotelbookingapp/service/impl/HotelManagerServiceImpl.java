package com.example.hotelbookingapp.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.hotelbookingapp.model.HotelManager;
import com.example.hotelbookingapp.model.User;
import com.example.hotelbookingapp.repository.HotelManagerRepository;
import com.example.hotelbookingapp.service.HotelManagerService;

@Service
@RequiredArgsConstructor
@Slf4j
public class HotelManagerServiceImpl implements HotelManagerService {

    private final HotelManagerRepository hotelManagerRepository;

    @Override
    public HotelManager findByUser(User user) {
        log.info("Attempting to find HotelManager for user ID: {}", user.getId());
        return hotelManagerRepository.findByUser(user)
                .orElseThrow(() -> new EntityNotFoundException("HotelManager not found for user " + user.getUsername()));
    }
}
