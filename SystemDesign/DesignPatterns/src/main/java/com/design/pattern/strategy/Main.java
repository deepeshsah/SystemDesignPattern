package com.design.pattern.strategy;

public class Main {
	public static void main( String[] args )
    {
    	Vehicle vehicle=new SportsVehicle();
		vehicle.drive();
		
		Vehicle vehicle1=new GoodsVehicle();
		vehicle1.drive();
    }
}
