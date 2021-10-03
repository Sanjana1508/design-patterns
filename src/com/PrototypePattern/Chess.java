package com.PrototypePattern;

public abstract class Chess implements Cloneable{

	int rows;
	int columns;
	
	public Chess() {
		rows=8;
		columns=8;
	}
	
	 public Object clone()
	    {
	        Object copy = null;
	        try 
	        {
	            copy = super.clone();
	        } 
	        catch (CloneNotSupportedException e) 
	        {
	            e.printStackTrace();
	        }
	        return copy;
	    }
}
