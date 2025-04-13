package com.restaurant.controller;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.service.BookingService;
lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/table")
    public List<BookingResponse> getAvailableTables(@RequestParam(required = false) String locationId,
                                                    @RequestParam(required = false) String date,
                                                    @RequestParam(required = false) String time,
                                                    @RequestParam(required = false) Integer guests) {
        return bookingService.getAvailableTables(locationId, date, time, guests);
    }

    @PostMapping("/client")
    public BookingResponse createBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.createBooking(bookingRequest);
    }
}
