package context;

public class MapElement {
	
	private boolean occupied;
	private int x, y;
	private double probability, length;
	
	public MapElement (int x, int y, double length, double probability, boolean occupied) {
		this.x = x;
		this.y = y;
		this.probability = probability;
		this.occupied = occupied;
		
	}

	public boolean isOccupied() {
		return occupied;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getProbability() {
		return probability;
	}
	
	//TODO Map Element aufsetzen! 
	/**(X/Y Position / besetzt oder nicht? / 
	 * Wahrscheinlichkeit ob es besetzt ist /
	 *  Trifft der Sensor das Element?
	 */
}
