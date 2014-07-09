package context;

public class MapElement {

	private boolean occupied;
	private int xPos, yPos;
	private double probability, length;
	private boolean thymio;
	private boolean hitByLaserBeam;

	public MapElement(int x, int y, double length, boolean occupied) {
		xPos = x;
		yPos = y;
		this.occupied = occupied;
		this.length = length;
		this.thymio = false;
		this.hitByLaserBeam = false;
		// System.out.println("x= "+ xPos + " y= " +y +" "+ occupied
		// +" length="+ length);
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public int getXPos() {
		return xPos;
	}

	public int getYPos() {
		return yPos;
	}

	public double getProbability() {
		return probability;
	}

	public void setThymio() {
		thymio = true;
	}

	public boolean hasThymio() {
		return thymio;
	}

	public boolean isHitByBeam() {
		return hitByLaserBeam;
	}

	public void setHitByLaserbeam() {
		hitByLaserBeam = true;
	}
	// TODO Map Element aufsetzen!
	/**
	 * (X/Y Position / besetzt oder nicht? / Wahrscheinlichkeit ob es besetzt
	 * ist / Trifft der Sensor das Element?
	 */

}
