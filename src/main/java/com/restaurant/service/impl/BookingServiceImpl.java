package com.restaurant.service.impl;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.model.Booking;
import com.restaurant.repository.BookingRepository;
import com.restaurant.service.BookingService;
lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public List<BookingResponse> getAvailableTables(String locationId, String date, String time, Integer guests) {
        // Implement logic to get available tables
    }

    @Override
    public BookingResponse createBooking(BookingRequest bookingRequest) {
        // Implement logic to create booking
    }
}
