package com.example.hotelbookingapp.service;

import java.util.List;

import com.example.hotelbookingapp.model.User;
import com.example.hotelbookingapp.model.dto.ResetPasswordDTO;
import com.example.hotelbookingapp.model.dto.UserDTO;
import com.example.hotelbookingapp.model.dto.UserRegistrationDTO;

public interface UserService {

    User saveUser(UserRegistrationDTO registrationDTO);

    // For registration
    User findUserByUsername(String username);

    UserDTO findUserDTOByUsername(String username);

    UserDTO findUserById(Long id);

    List<UserDTO> findAllUsers();

    void updateUser(UserDTO userDTO);

    void updateLoggedInUser(UserDTO userDTO);

    void deleteUserById(Long id);

    User resetPassword(ResetPasswordDTO resetPasswordDTO);

}
