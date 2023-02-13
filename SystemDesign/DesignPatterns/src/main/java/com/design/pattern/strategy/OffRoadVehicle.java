package com.design.pattern.strategy;

import com.design.pattern.strategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
