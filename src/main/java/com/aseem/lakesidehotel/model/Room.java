package com.aseem.lakesidehotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;

    //Each room has its own photo, so for that -->
    @Lob
    private Blob photo;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BookedRoom> bookings;

    public Room(){
        this.bookings = new ArrayList<>();
    }

    public void addBooking(BookedRoom booking){
        if(bookings == null){
            bookings = new ArrayList<>();
        }

        bookings.add(booking);
        booking.setRoom(this);
        isBooked = true;
        //We'll have to provide a booking code for the bookings made
        String bookingCode = RandomStringUtils.randomAlphanumeric(10);
        booking.setBookingConfirmationCode(bookingCode);
    }
}
