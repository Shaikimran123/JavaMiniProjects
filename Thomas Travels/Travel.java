package ThmousTravels;

import java.util.ArrayList;

public class Travel {

	boolean isCarDriver(Driver driver)
	{
		return driver.getCategory().equalsIgnoreCase("Car");
	}
	
	
	String retriveByDriverID(ArrayList<Driver> drivers, int driverID )
	{
		for (Driver driver: drivers)
		{
			if (driver.driverId==driverID)
			{
				return  "The Driver name is "+ driver.getDriverName()+" Belonging to the category "+ driver.getCategory()+" traveled "+driver.getTotalDistance() +"KM so far.";    
			}
		}
		
	return "Driver not found";	
	}
	
	int retriveCountOfDrivers(ArrayList<Driver> drivers, String category) {
		
		int count=0;
		for(Driver driver: drivers)
		{
			if(driver.getCategory().equalsIgnoreCase(category))
			{
				count++;
			}
		}
		
		return count;
	}
	
	ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers, String category)
	{
	ArrayList<Driver> newArray=new ArrayList<>();
	
	for(Driver driver: drivers)
	{
		if (driver.getCategory().equalsIgnoreCase(category))
			newArray.add(driver);
	}
	
	return newArray; 	
	}
	
	Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers)
	{
		
		Driver dd=drivers.get(0);
		for (Driver d: drivers)
		{
			if (dd.totalDistance<d.totalDistance)
			{
				dd=d;
			}
		}
	
		return dd;
	}
	
	
}
