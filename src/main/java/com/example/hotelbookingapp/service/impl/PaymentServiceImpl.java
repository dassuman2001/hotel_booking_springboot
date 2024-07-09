package com.example.hotelbookingapp.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.hotelbookingapp.model.Booking;
import com.example.hotelbookingapp.model.Payment;
import com.example.hotelbookingapp.model.dto.BookingInitiationDTO;
import com.example.hotelbookingapp.model.enums.Currency;
import com.example.hotelbookingapp.model.enums.PaymentMethod;
import com.example.hotelbookingapp.model.enums.PaymentStatus;
import com.example.hotelbookingapp.repository.PaymentRepository;
import com.example.hotelbookingapp.service.PaymentService;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(BookingInitiationDTO bookingInitiationDTO, Booking booking) {
        Payment payment = Payment.builder()
                .booking(booking)
                .totalPrice(bookingInitiationDTO.getTotalPrice())
                .paymentStatus(PaymentStatus.COMPLETED) // Assuming the payment is completed
                .paymentMethod(PaymentMethod.CREDIT_CARD) // Default to CREDIT_CARD
                .currency(Currency.USD) // Default to USD
                .build();

        Payment savedPayment = paymentRepository.save(payment);
        log.info("Payment saved with transaction ID: {}", savedPayment.getTransactionId());

        return savedPayment;
    }
}
