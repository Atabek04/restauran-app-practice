package com.restaurant.service.impl;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.repository.BookingRepository;
import com.restaurant.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<BookingResponse> getAvailableTables(String locationId, String date, String time, int guests) {
        // Implement logic to get available tables
        return null;
    }

    @Override
    public BookingResponse createBooking(BookingRequest bookingRequest) {
        // Implement logic to create a booking
        return null;
    }
}