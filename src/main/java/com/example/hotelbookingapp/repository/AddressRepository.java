package com.example.hotelbookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelbookingapp.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
