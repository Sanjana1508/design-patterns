package com.FactoryPattern;

public class ValiadateFactory extends BaseAuthenticateFactory{

	@Override
	public TwoFactorAuthentication validate(String type) {
		TwoFactorAuthentication twoFA;
		switch(type) {
		case "sms":
			twoFA = new SMSNotification();
			break;
		case "email":
			twoFA = new EmailNotification();
			break;
		case "authApp":
			twoFA = new AuthenticatorApplication();
			break;
		default:
			throw new IllegalArgumentException("Not a valid type");
		}	
		return twoFA;
	}
	
}
