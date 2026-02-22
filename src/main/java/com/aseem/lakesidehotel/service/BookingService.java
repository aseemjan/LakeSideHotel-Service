package com.aseem.lakesidehotel.service;


import com.aseem.lakesidehotel.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements IBookingService {
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return null;
    }

    @Override
    public List<BookedRoom> getAllBookings() {
        return List.of();
    }

    @Override
    public void cancelBooking(Long bookingId) {

    }

    @Override
    public String saveBooking(Long roomId, BookedRoom bookingRequest) {

        return null;
    }

    @Override
    public BookedRoom findByBookingConfirmationCode(String confirmationCode) {
        return null;
    }
}
