package StrategyPattern;

import StrategyPattern.Strategies.NormalDrive;
import StrategyPattern.Strategies.SportsDrive;

public class PassengerVehicle extends Vehicle{

	public PassengerVehicle() {
		super(new NormalDrive());
	}

	
}
