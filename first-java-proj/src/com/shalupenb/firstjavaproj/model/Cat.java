package com.shalupenb.firstjavaproj.model;

public class Cat {
	
	protected static int count;
	
	static {
		count = 0;
	}
	
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Cat() {
		this("Sirko"); 
		// делегування до головного конструктора
		// мае бути першим рядком в тiлi конструктора
        // System.out.println("test");
    }
 
	// main c-tor
	public Cat(String name) {
		count++;
		setName(name);
    }
	
	public static int getCount() {
		return count;
	}
}
 