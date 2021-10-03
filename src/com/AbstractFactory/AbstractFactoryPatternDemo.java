package com.AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		 AbstractFactory nonAir = FactoryCreator.getFactory(false);
		 Transport bus = nonAir.getTicket("Bus");
		 bus.TransportType();
		 
		 AbstractFactory air = FactoryCreator.getFactory(true);
		 Transport plane = air.getTicket("plane");
		 plane.TransportType();
	}

}
