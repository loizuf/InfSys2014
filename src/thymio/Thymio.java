package thymio;

public class Thymio {
	
	private int xPos, yPos;
	private double angle;
	
	public Thymio(int x, int y, double angle) {
		this.xPos = x;
		this.yPos = y;
		this.angle = angle;
	}
	//TODO Thymio aufsetzen: X Koordinate / Y Koordinate / Orientierung
	//done

	public double getAngle() {
		return angle;
	}

}
