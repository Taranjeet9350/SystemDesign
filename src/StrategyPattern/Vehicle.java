package StrategyPattern;

import StrategyPattern.Strategies.DriveStrategy;

public class Vehicle {
	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		// TODO Auto-generated constructor stub
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
