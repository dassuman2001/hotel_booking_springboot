package com.example.hotelbookingapp.service;

import com.example.hotelbookingapp.model.HotelManager;
import com.example.hotelbookingapp.model.User;

public interface HotelManagerService {

    HotelManager findByUser(User user);

}
