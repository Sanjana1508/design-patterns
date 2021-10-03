package com.FactoryPattern;

public class EmailNotification implements TwoFactorAuthentication{

	@Override
	public void authenticate() {
		System.out.println("Verification code is sent to your mail.");
		
	}

}
