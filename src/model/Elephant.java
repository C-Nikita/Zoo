package model;

public class Elephant {
	private int weight;
	private String color;
	private int age;

	public Elephant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elephant(int weight, String color, int age) {
		super();
		this.weight = weight;
		this.color = color;
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Trumpets";
	}

}