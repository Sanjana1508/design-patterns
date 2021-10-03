package com.FactoryPattern;

public class SMSNotification implements TwoFactorAuthentication{

	@Override
	public void authenticate() {
		System.out.println("Verification code is sent as sms to your mobile");
		
	}
	
}
