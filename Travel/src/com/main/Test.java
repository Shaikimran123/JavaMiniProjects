package com.main;

import java.util.ArrayList;
import java.util.List;

import com.modal.Driver;
import com.services.Travel;

public class Test {

	public static void main(String[] args) {

		ArrayList<Driver> drivers=new ArrayList<Driver>();
		
		drivers.add(new Driver(1,"imran","Car",2009.9));
		drivers.add(new Driver(2,"john","lorry",20.9));
		drivers.add(new Driver(3,"sushu","scooty",50.9));
		drivers.add(new Driver(4,"soor","Car",280.9));
		drivers.add(new Driver(5,"prabhas","Car",700.9));
		drivers.add(new Driver(6,"mansur","bike",900.9));
		drivers.add(new Driver(7,"shaik","Car",260.9));
		drivers.add(new Driver(8,"KR","bychicle",205.9));
		drivers.add(new Driver(9,"soor","Car",2043.9));
		drivers.add(new Driver(10,"immu","Car",250.9));
	
		Driver d1=new Driver(10,"immu","Car",250.9);
		Driver d2=new Driver(10,"immu","bike",250.9);
		
		Travel travel=new Travel();
		boolean carDriver = travel.isCarDriver(d2);
		System.out.println(carDriver);
		
		String retriveByDriverId = travel.retriveByDriverId(drivers, 10);
		System.out.println(retriveByDriverId);
		
		long retriveCountOfDriver = travel.retriveCountOfDriver(drivers, "car");
		System.out.println(retriveCountOfDriver);
		
		List<Driver> retriveDriver = travel.retriveDriver(drivers,"car");
		System.out.println(retriveDriver);
		
		Driver retriveMaxDisTravelledDriver = travel.retriveMaxDisTravelledDriver(drivers);
		System.out.println(retriveMaxDisTravelledDriver);
		
	}

}
