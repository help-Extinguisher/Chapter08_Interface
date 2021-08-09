package ch08_2_polymorphism;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle_ vehicle = new Bus_();
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus_ bus = (Bus_) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
