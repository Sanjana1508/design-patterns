package com.BuilderPattern;

public class BuilderPatterndemo {

	public static void main(String[] args) {
		
		URLBuilder builder1 = new URLBuilder("https","localhost",8090,"api/students");
		builder1=builder1.setParamName("abc");
		URL url1= builder1.build();
		System.out.println("\n"+url1);
		
		
		
		URLBuilder builder2 = new URLBuilder("https","localhost",8090,"api/students");
		builder2.setParamName("abc");
		builder2.setParamOrder("desc");
		URL url2= builder2.build();
		System.out.println("\n\n"+url2);
	}
}
