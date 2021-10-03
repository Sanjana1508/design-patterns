package com.FactoryPattern;

public abstract class BaseAuthenticateFactory {
	
	public abstract TwoFactorAuthentication validate(String type);
}
