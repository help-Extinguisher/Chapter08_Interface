package ch08_2_polymorphism;

public class Driver {

	public void drive(Vehicle ve) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		ve.run();

		
	}

//	public void drive(Taxi taxi) {
//		taxi.run();

		
//	}

}
