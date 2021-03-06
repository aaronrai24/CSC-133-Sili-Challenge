package com.mycompany.myapp;

import java.util.Random;

public abstract class MovableObject extends GameObject
{
	private int heading;
	protected int speed ; // Drone class is accessing 
	
	public MovableObject(int heading) 
	{
		this.heading= heading;
	}
	public void move (int time, int mapHeight,int mapWidth)// This method updates the location of movable object based on its current heading and speed
	{

		double deltaX = (Math.cos(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
		double deltaY = (Math.sin(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
		deltaX *= time / 50;
		deltaY *= time / 50;
		this.setXlocation(this.getXlocation() + (float)deltaX,100000,100000);
		this.setYlocation(this.getYlocation() + (float)deltaY,100000,100000);
	}
	public void setSpeed(int speed)// setter method for speed
	{
		this.speed = speed;
	}
	public int getSpeed()// Getter method for speed
	{
		return speed;
	}
	public void setHeading(int heading)// setter method for heading
	{
		this.heading = heading;
	}
	public int getHeading()// getter method for heading
	{
		return heading;
	}
	public void changeHeading(int heading)
	{
		if (this instanceof ISteerable)
		{
			this.heading= heading;
		}
	}
	public String toString() // Display method
	{
		String parentDesc = super.toString();
		String myDesc = " heading=" + heading + " speed=" + speed ;
		return parentDesc + myDesc;
	}

}
