package com.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

	private static Map<String, Chess> chessMap = new HashMap(); 
	
	static {
		
		chessMap.put("variant1",new ChessVariant1());
		chessMap.put("variant2",new ChessVariant2());
	}
	
	public static Chess getChess(String variant) {
		
		return (Chess) chessMap.get(variant).clone();
	}
}
