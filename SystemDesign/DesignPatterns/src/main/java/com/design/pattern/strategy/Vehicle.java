package com.design.pattern.strategy;

import com.design.pattern.strategy.strategy.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy dStrategy) {
		this.driveStrategy=dStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}

}
