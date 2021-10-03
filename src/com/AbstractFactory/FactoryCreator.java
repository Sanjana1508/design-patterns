package com.AbstractFactory;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(boolean isAir) {
		if(isAir) {
			return new ByAirFactory();
		}
		else {
			return new ByNonAirFactory();
		}
	}

}
