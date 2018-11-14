package model;

// Craig Longnecker
public class Frog { // Begin class Frog.
	private String frogType;
	private String color;
	private String stageOfLife;

	public Frog() { // Default Constructor
	}

	public Frog(String frogType, String color, String stageOfLife) { // Non-Default Constructor.
		this.frogType = frogType;
		this.color = color;
		this.stageOfLife = stageOfLife;
	}

	public String getFrogType() { // Get and Set FrogType.
		return frogType;
	}

	public void setFrogType(String frogType) {
		this.frogType = frogType;
	}

	public String getColor() { // Get and Set Color.
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStageOfLife() { // Get and Set StageOfLife.
		return stageOfLife;
	}

	public void setStageOfLife(String stageOfLife) {
		this.stageOfLife = stageOfLife;
	}

	public String speak() { // Speak method.
		return "Ribbit!!!!!!!!!";
	}
} // Close class Frog.
