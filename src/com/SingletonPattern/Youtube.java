package com.SingletonPattern;

public class Youtube {
	MediaDriver instance=MediaDriver.getObject();
	
	Youtube(){
		instance.operate();
	}
}
