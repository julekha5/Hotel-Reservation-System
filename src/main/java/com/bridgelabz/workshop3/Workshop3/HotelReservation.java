package com.bridgelabz.workshop3.Workshop3;
import java.util.HashMap;

/*
 * Hotel Reservation System Program
 */
public class HotelReservation {
	
	 HashMap<String ,Hotel> hotels = new HashMap<>();
	    /**
	     * This method is used to add hotels to hotel reservation system
	     * with all the rates and stored in the hashmap
	     */
	    public int addHotel() {
	        Hotel hotel1 = new Hotel("LakeWood",110,90);
	        Hotel hotel2 = new Hotel("BridgeWood",150,50);
	        Hotel hotel3 = new Hotel("RidgeWood",220,150);
	        hotels.put(hotel1.getHotelName(),hotel1);
	        hotels.put(hotel2.getHotelName(),hotel2);
	        hotels.put(hotel3.getHotelName(),hotel3);
	        return hotels.size();
	    }

	
	public static void main(String[] args){ 
		System.out.println("Welcome to hotel reservation system program");
	}

}



