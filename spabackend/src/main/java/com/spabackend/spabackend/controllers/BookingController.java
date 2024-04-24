package com.spabackend.spabackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spabackend.spabackend.models.Booking;
import com.spabackend.spabackend.services.BookingService;

@RestController
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public String getRoot() {
        return "{'Hello': 'World'}";
    }

    @PostMapping("/booking")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }
}
