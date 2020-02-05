/*
 *  City.java
 *
 *  Created by John Stringer on 2/12/2018.
 *  Copyright © 2018 John Stringer. All rights reserved.
 *	This class is used to create instances of city objects from the CityMain
 *  class. Each instance of the city contains 3 pieces of information a cityName,
 *  and arrays of the last 10 days of average wind speed and temperatures.
 */
package teachercitytemperatures;

public class City
{
  // declare the fields for each record
	private String cityName;
	private int windSpeed;
	private int temperature[];
		
	// There follows 2 constructor methods for
	// the private members are only accessible within the city class
	
	//method overloading/polymorphism
	
	//creates a default city template
	City ()
    {
        	cityName = "-";
		windSpeed = -1;
        	//temperature = -100;
    }
	
	//creates a city based on 3 parameters passed to it either by the user or
	//read in from the CityTemperatures.txt database
	City (String cityName, int windSpeed, int[] temperature){
		this.cityName = cityName;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
	}
	
	//getter methods for city name and wind speed. 
	//Wind speed is single average based on 10 days
	//temperatures is the average per day over the past 10 days.
	
	String getCityName() {
		return this.cityName;
	}
	
	int getWindSpeed() {
		return this.windSpeed;
	}
	
	int[] getTemp() {
		return this.temperature;
	}
	
	//setter methods
	//set by the user in CityMain class or are populated from the CityTemperatures.txt database
	//from the LoadData class
	void setCityName(String name){
		this.cityName = name;
	}
	
	//calculations for the averages are made in the calculations class
	void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	void setTemp (int[] temp) {
		this.temperature = temp;
	}
}


