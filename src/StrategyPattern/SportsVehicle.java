package StrategyPattern;

import StrategyPattern.Strategies.SportsDrive;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDrive());
	}

	
}
