package StrategyPattern;

import StrategyPattern.Strategies.SportsDrive;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportsDrive());
	}

	
}
