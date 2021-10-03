package com.SingletonPattern;

public class MediaDriver {

	private static MediaDriver object=new MediaDriver();
	
	private MediaDriver() {
		
	}
	
	public static MediaDriver getObject() {
		return object;
	}
	
	public void operate() {
		System.out.println("MediaDriver is operating");
	}
}
