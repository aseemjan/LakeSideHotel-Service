package com.aseem.lakesidehotel.service;

import com.aseem.lakesidehotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {

    List<BookedRoom> getAllBookings();

    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
