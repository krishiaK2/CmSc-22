public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	public void resize(int percentage){
		radius = ((radius * (percentage / 100.0)) + radius);
	}

	@Override
	public String toString() {
		return String.format("radius = %f", super.radius);
	}
}