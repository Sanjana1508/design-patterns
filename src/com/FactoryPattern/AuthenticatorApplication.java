package com.FactoryPattern;

public class AuthenticatorApplication implements TwoFactorAuthentication{
	
	@Override
	public void authenticate() {
		System.out.println("Enter current verification code in authenticator app");
		
	}
}
