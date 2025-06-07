package ThmousTravels;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		
	ArrayList<Driver> driverList=new ArrayList<>();
	
	driverList.add(new Driver(100, "immu", "Car", 4200));
	driverList.add(new Driver(101, "anju", "Auto", 400));
	driverList.add(new Driver(102, "pooji", "lorry", 0));
	driverList.add(new Driver(103, "Kr", "Car", 420));
	driverList.add(new Driver(104, "soor", "Car", 50000));
	
	Travel travel=new Travel();
	System.out.println("Is immu a Car driver? " + travel.isCarDriver(driverList.get(0)));
	
	System.out.println(travel.retriveByDriverID(driverList, 101));

	System.out.println("Car Drivers count : "+ travel.retriveCountOfDrivers(driverList, "Auto"));
	
	System.out.println(travel.retriveDriver(driverList, "Auto"));
	
	Driver driver=travel.RetriveMaximumDistanceTravelledDriver(driverList);
	System.out.println("Driver with max distance " + driver.getDriverName()+ " - " + driver.getTotalDistance() +" KMs.");
	}

	

}
