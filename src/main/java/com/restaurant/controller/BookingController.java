package com.restaurant.controller;

import com.restaurant.dto.BookingRequest;
import com.restaurant.dto.BookingResponse;
import com.restaurant.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/table")
    @ResponseStatus(HttpStatus.OK)
    public List<BookingResponse> getAvailableTables(@RequestParam(required = false) String locationId,
                                                    @RequestParam(required = false) String date,
                                                    @RequestParam(required = false) String time,
                                                    @RequestParam(required = false) int guests) {
        return bookingService.getAvailableTables(locationId, date, time, guests);
    }

    @PostMapping("/client")
    @ResponseStatus(HttpStatus.CREATED)
    public BookingResponse createBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.createBooking(bookingRequest);
    }
}