package model;

//Jesse Uchytil 11-12-18

public class Squirrel {
	private String color;
	private int age;
	private double speed;
	
	public Squirrel() {//create default squirrel.
		color = "red";
		age = 0;
		speed = 10.0;
	}
	
	public Squirrel(String color, int age, double speed) {//create custom squirrel
		this.color = color;
		this.age = age;
		this.speed = speed;
	}
	
	public String speak() {
		return "Chitters";
	}

	//Getters and setters.
	
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public double getSpeed() {return speed;}
	public void setSpeed(double speed) {this.speed = speed;}
	
}
