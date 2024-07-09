package com.example.hotelbookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelbookingapp.model.Role;
import com.example.hotelbookingapp.model.enums.RoleType;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleType(RoleType roleType);
}
