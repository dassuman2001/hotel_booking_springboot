package com.example.hotelbookingapp.service;

import com.example.hotelbookingapp.model.Booking;
import com.example.hotelbookingapp.model.Payment;
import com.example.hotelbookingapp.model.dto.BookingInitiationDTO;

public interface PaymentService {

    Payment savePayment(BookingInitiationDTO bookingInitiationDTO, Booking booking);
}
