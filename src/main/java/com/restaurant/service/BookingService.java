package com.restaurant.service;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.model.Booking;
import com.restaurant.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public BookingResponse createBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setTableId(bookingRequest.getTableId());
        booking.setCustomerId(bookingRequest.getCustomerId());
        booking.setBookingTime(bookingRequest.getBookingTime());

        bookingRepository.save(booking);

        return new BookingResponse(booking.getId(), booking.getTableId(), booking.getCustomerId(), booking.getBookingTime());
    }

    public List<BookingResponse> getBookingsByTable(String tableId) {
        return bookingRepository.findByTableId(tableId).stream()
                .map(booking -> new BookingResponse(booking.getId(), booking.getTableId(), booking.getCustomerId(), booking.getBookingTime()))
                .collect(Collectors.toList());
    }
}
