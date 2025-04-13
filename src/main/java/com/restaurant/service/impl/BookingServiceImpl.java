package com.restaurant.service.impl;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.model.Booking;
import com.restaurant.repository.BookingRepository;
import com.restaurant.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public List<BookingResponse> getAvailableTables(String locationId, String date, String time, int guests) {
        // Implement logic to fetch available tables based on locationId, date, time, and guests
        // For now, returning an empty list
        return bookingRepository.findByTableId(locationId).stream()
                .map(booking -> new BookingResponse(booking.getId(), booking.getTableId(), booking.getCustomerId(), booking.getBookingTime()))
                .collect(Collectors.toList());
    }

    @Override
    public BookingResponse createBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setTableId(bookingRequest.getTableId());
        booking.setCustomerId(bookingRequest.getCustomerId());
        booking.setBookingTime(bookingRequest.getBookingTime());

        Booking savedBooking = bookingRepository.save(booking);
        return new BookingResponse(savedBooking.getId(), savedBooking.getTableId(), savedBooking.getCustomerId(), savedBooking.getBookingTime());
    }
}