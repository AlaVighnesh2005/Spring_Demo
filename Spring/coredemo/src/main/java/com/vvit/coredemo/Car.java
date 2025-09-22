package com.vvit.coredemo;

public class Car {
	
	private int wheels;
	
	public Car(int wheels)
	{
		this.wheels = wheels;
	}
	
	public void driving() 
	{
		System.out.println("in car.... " + wheels);
	}

}
