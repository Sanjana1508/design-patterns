package com.PrototypePattern;

public class ChessVariant1 extends Chess {

	private int players;
	
	public ChessVariant1() {
		super();
		players=2;
		System.out.println("Chess Board Initial Setup for Variant1 for "+players+" players");
	}

	@Override
	public String toString() {
		return "ChessVariant1 [players=" + players + ", rows=" + rows + ", columns=" + columns + "]";
	}
	
	
}
