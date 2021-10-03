package com.FactoryPattern;

public class FactoryDesignDemo {
	public static void main(String[] args) {
		BaseAuthenticateFactory authFactory = new ValiadateFactory();
		
		TwoFactorAuthentication twoFA = authFactory.validate("sms"); 
		
		twoFA.authenticate();
	}
}
