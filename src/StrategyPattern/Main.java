package StrategyPattern;

import StrategyPattern.Strategies.NormalDrive;

public class Main {

	public static void main(String[] args) {
		//Vehicle vehicle = new SportsVehicle();
		Vehicle vehicle = new PassengerVehicle();
		 vehicle.drive();
	}

	
}
