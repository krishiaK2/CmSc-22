public abstract class Shape {

	protected String color = "red";
	protected boolean filled = true;

	public Shape(){
		color = "green";
		filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public String toString() {
		String isFilled = "";
		if (filled == true) {
			isFilled = "filled";
		} else {
			isFilled = "not filled";
		}
		return "A shape with color of " + color + " and " + isFilled;
	}
}