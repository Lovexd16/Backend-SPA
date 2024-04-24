package com.spabackend.spabackend.services;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.spabackend.spabackend.models.Booking;

@Service
public class BookingService {
    private final MongoOperations mongoOperations;

    public BookingService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public Booking addBooking(Booking booking) {
        return mongoOperations.insert(booking);
    }
}
