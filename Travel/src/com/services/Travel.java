package com.services;

import java.util.ArrayList;
import java.util.List;

import com.modal.Driver;

public class Travel {
	
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("car");
	}

	public String retriveByDriverId(ArrayList<Driver> drivers, int driverId) {
		
		/*
		for(Driver driver: drivers) {
			if(driver.getDriverId() ==driverId) {
				return "Driver name is " + driver.getDriverName()+ " belonging to the category "+ driver.getCategory() + " travelled "+ driver.getTotalDistance() + " KM so far";
			}
		}
		return "No driver match";
	   */
		 return drivers
		    .stream()
		 	.filter(d ->d.getDriverId() ==driverId)
		 	.findFirst()
		 	.map(d ->String.format("Driver name is %s belonging to the category %s travelled %.2f KM so far",d.getDriverName(), d.getCategory(), d.getTotalDistance()))
		    .orElse("No driver matched");
	}
	
	public long retriveCountOfDriver(ArrayList<Driver> drivers, String Category) {
		
		/*
		int count=0;
		for(Driver driver: drivers) {
			if(driver.getCategory().equalsIgnoreCase(Category)) {
				count++;
			}
		}
		return count;
		*/
		return drivers
				.stream()
				.filter(d->d.getCategory().equalsIgnoreCase(Category))
				.count();		
	}
	public List<Driver> retriveDriver(ArrayList<Driver> drivers, String catrgory){
		
		/*
		ArrayList<Driver> res=new ArrayList<Driver>();
		for(Driver driver: drivers) {
			if(driver.getCategory().equalsIgnoreCase(catrgory)) {
				res.add(driver);
			}
		}
		return res;
		
		*/
		
		return drivers
				.stream()
				.filter(d->d.getCategory().equalsIgnoreCase(catrgory))
				.toList();
	}
	
	
	public Driver retriveMaxDisTravelledDriver(ArrayList<Driver> drivers) {
		/*
		Driver maxDriver = drivers.get(0);
		for(Driver driver: drivers) {
			if(driver.getTotalDistance() > maxDriver.getTotalDistance()) {
				maxDriver=driver;
			}
		}
		return maxDriver;
		*/
		
		return drivers
				.stream()
				.sorted((d1,d2) -> Double.compare(d2.getTotalDistance(),d1.getTotalDistance()))
				.findFirst()
				.get();
						
	}
	
	
}
