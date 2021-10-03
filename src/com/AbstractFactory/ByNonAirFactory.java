package com.AbstractFactory;

public class ByNonAirFactory extends AbstractFactory{

	@Override
	public Transport getTicket(String type) {
		Transport transport;
		switch(type){
			case "Bus":
				transport = new Bus();
				break;
			case "Train":
				transport = new Train();
				break;
			default:
				throw new IllegalArgumentException("not a valid transport");
		}
		return transport;
	}

}
