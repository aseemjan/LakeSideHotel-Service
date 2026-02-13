package com.aseem.lakesidehotel.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BookedRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;


    @Column(name = "Check_In")
    private LocalDate checkInDate;
    @Column(name = "Check_Out")
    private LocalDate checkOutDate;

    @Column(name = "Guest_Full_Name")
    private String guestFullName;
    @Column(name = "Guest_Email")
    private String guestEmail;

    @Column(name = "Adults")
    private int NumOfAdults;
    @Column(name = "Children")
    private int NumOfChildren;
    @Column(name = "Total_Guests")
    private int totalNumOfGuests;

    @Column(name = "Confirmation_Code")
    private String bookingConfirmationCode;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Room_Id")
    private Room room;



    public void calculateTotNumOfGuests(){
        this.totalNumOfGuests = this.NumOfAdults + this.NumOfChildren;
    }

    // Calling the 'calculateTotNumOfGuests()' method inside below 2 setters so that if there is a change in count of Num
    // Of Adults AND/OR Children, it'll get recalculated
    public void setNumOfAdults(int numOfAdults) {
        NumOfAdults = numOfAdults;
        calculateTotNumOfGuests();
    }

    public void setNumOfChildren(int numOfChildren) {
        NumOfChildren = numOfChildren;
        calculateTotNumOfGuests();
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

}
