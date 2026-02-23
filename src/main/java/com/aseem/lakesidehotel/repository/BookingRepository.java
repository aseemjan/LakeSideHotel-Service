package com.aseem.lakesidehotel.repository;

import com.aseem.lakesidehotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {
    List<BookedRoom> findByRoomId(Long roomId);

    List<BookedRoom> findAll();

    void deleteById(Long bookingId);


    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
