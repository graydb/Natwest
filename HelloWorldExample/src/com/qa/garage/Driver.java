package com.qa.garage;

	
	
	public class Driver {
		private String name;
		private int mileage;
		// functionality
	   
		public Driver (String name, int mileage) {
		this.name=name;
		this.mileage=mileage;
		}
		
		
		public void drive( int milesDriven) {
	        this.setMileage(this.getMileage() + milesDriven);
	        
	        
		}
		public int getMileage() {
			return mileage;
		}
		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
		@Override
		public String toString() {
			return "Driver [mileage=" + mileage + "]";
		}
	    
	}
	    