package ThmousTravels;

public class Driver {
	int driverId;
	String driverName;
	String category; //auto/car/lorry
	int totalDistance;
	
	
	public Driver(int driverId, String driverName, String category, int totalDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}


	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", totalDistance=" + totalDistance + "]";
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getTotalDistance() {
		return totalDistance;
	}


	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	
	
	
	
	

}
