package com.design.pattern.strategy;

import com.design.pattern.strategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

	GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}
