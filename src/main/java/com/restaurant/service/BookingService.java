package com.restaurant.service;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;

import java.util.List;

public interface BookingService {
    List<BookingResponse> getAvailableTables(String locationId, String date, String time, int guests);
    BookingResponse createBooking(BookingRequest bookingRequest);
    BookingResponse cancelBooking(String bookingId);
}