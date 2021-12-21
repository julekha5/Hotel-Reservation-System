package com.bridgelabz.workshop3.Workshop3;

public class Hotel {
	
	  
	
		public String hotelName;
	    public int weekdayRegularRate;
	    public int weekendRegularRate;
	    
	    //Constructor
		/**
		 * @param hotelName
		 * @param weekdayRegularRate
		 * @param weekendRegularRate
		 * @param rating
		 */
		public Hotel(String hotelName, int weekdayRegularRate, int weekendRegularRate) {
			super();
			this.hotelName = hotelName;
			this.weekdayRegularRate = weekdayRegularRate;
			this.weekendRegularRate = weekendRegularRate;
		}
	   
		//getter setter
		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public int getWeekdayRegularRate() {
			return weekdayRegularRate;
		}

		public void setWeekdayRegularRate(int weekdayRegularRate) {
			this.weekdayRegularRate = weekdayRegularRate;
		}

		public int getWeekendRegularRate() {
			return weekendRegularRate;
		}

		public void setWeekendRegularRate(int weekendRegularRate) {
			this.weekendRegularRate = weekendRegularRate;
		}

		
		
	    
}
