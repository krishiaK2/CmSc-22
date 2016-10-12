 public class MovableCircle implements Movable {

 	private int radius;
 	private MovablePoint center;

 	public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
 		center = new MovablePoint(x, y, xSpeed, ySpeed);
 		this.radius = radius;
 	}

 	@Override
	public void moveUp() {
		center.moveUp(); //center.y -= center.ySpeed; 
	}

	@Override
	public void moveDown() {
		center.moveDown(); //center.y += center.ySpeed; 
	}

	@Override
	public void moveLeft() {
		center.moveLeft(); //center.x -= center.xSpeed; 
	}

	@Override
	public void moveRight() {
		center.moveRight(); //center.x += center.xSpeed; 
	}

	public String toString() {
		return String.format("[radius = %d, center.x = %d, center.y = %d, xSpeed = %d, ySpeed = %d", radius, center.x, center.y, center.xSpeed, center.ySpeed);
	}

}