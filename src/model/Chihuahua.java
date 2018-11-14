package model;

public class Chihuahua {
	private String name;
	private int weightInPounds;
	private boolean isTheBest;

	/**
	 * no arg constructor
	 */
	public Chihuahua() {
	}

	/**
	 * @param name
	 * @param weightInPounds
	 * @param isTheBest
	 */
	public Chihuahua(String name, int weightInPounds, boolean isTheBest) {
		this.name = name;
		this.weightInPounds = weightInPounds;
		this.isTheBest = isTheBest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public boolean isTheBest() {
		return isTheBest;
	}

	public void setTheBest(boolean isTheBest) {
		this.isTheBest = isTheBest;
	}

	@Override
	public String toString() {
		return "Chihuahua [name=" + name + ", weightInPounds=" + weightInPounds + ", isTheBest=" + isTheBest + "]";
	}
	
	public String speak() {
		return "Give me more smoked trout, yip yip yip!";
	}

}
