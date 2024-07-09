package com.example.hotelbookingapp.service;

import java.util.Optional;

import com.example.hotelbookingapp.model.Customer;

public interface CustomerService {

    Optional<Customer> findByUserId(Long userId);

    Optional<Customer> findByUsername(String username);
}
