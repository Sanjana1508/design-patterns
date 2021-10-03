package com.AbstractFactory;

public class ByAirFactory extends AbstractFactory{

	@Override
	public Transport getTicket(String type) {
		if(type.equalsIgnoreCase("plane"))
			return new Plane();
		return null;
	}

}
