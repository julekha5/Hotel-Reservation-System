package com.bridgelabz.workshop3.Workshop3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationSystemTest {
    HotelReservation hotel;
    @Before
    public void initializeClass(){
        hotel = new HotelReservation();
    }
    @Test
    public void givenHotelNamesWhenAddedShouldReturnSize(){
        Assert.assertEquals(3,hotel.addHotel());
    }
}