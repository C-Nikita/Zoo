package model;

public class RoadRunner {

// Norm Brown
// road runner born 9/17/1949-- created by Chuck Jones & Michael Maltese -- voice by	Paul Julian
	private String name;
	private String breed;
	private int age;

	public RoadRunner() {
		super();
	}

	public RoadRunner(String n, String b, int a) {
		super();
		this.name = n;
		this.breed = b;
		this.age = a;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Beep-Beep!!";
	}
}