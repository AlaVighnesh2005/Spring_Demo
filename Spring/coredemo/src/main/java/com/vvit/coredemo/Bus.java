package com.vvit.coredemo;

public class Bus {

	private int wheels;
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}
	
	public void driving()
	{
		System.out.println("in bus.... " + wheels );
	}
}
