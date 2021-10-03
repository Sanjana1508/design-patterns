package com.PrototypePattern;

public class ChessVariant2 extends Chess {

	private int players;
	
	public ChessVariant2() {
		super();
		players=4;
		System.out.println("\n\nChess Board Initial Setup for Variant2f or "+players+" players");
	}

	@Override
	public String toString() {
		return "ChessVariant2 [players=" + players + ", rows=" + rows + ", columns=" + columns + "]";
	}
	
	
}
