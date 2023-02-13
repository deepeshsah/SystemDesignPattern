package com.design.pattern.strategy;

import com.design.pattern.strategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	SportsVehicle() {
		super(new SportsDriveStrategy());
	}
}
