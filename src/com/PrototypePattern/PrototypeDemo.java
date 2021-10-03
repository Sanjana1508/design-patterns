package com.PrototypePattern;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Chess chess1 = PrototypeRegistry.getChess("variant1");
		
		Chess chess2 = PrototypeRegistry.getChess("variant2");
		
		System.out.println(chess1);
		System.out.println(chess2);
	}

	
}
