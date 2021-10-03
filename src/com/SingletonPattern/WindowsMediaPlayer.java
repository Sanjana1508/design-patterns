package com.SingletonPattern;

public class WindowsMediaPlayer {
	MediaDriver instance=MediaDriver.getObject();
	
	WindowsMediaPlayer(){
		instance.operate();
	}
}
