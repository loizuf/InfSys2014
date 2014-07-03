package context;

import java.util.ArrayList;
import java.util.Random;

public class Map {

	private int sizeX, sizeY; // number of elements in each direction
								// used to get a discrete model of the
								// environment

	private MapElement[][] map; // Array of MapElement representing the, changed
								// name to map from element
								// environment
	private double edgelength; // each element in this maps covers edgelength^2
								// square units.
	private Random r;
	private ArrayList<Integer> occupiedElements;
	private int thymioX;
	private int thymioY;

	public static final int N = 20; // number of occupied elements

	public Map(int x, int y, double l) {

		sizeX = x;
		sizeY = y;
		edgelength = l;

		initMap();
	}

	private void initMap() {
		r = new Random();
		map = new MapElement[sizeX][sizeY];
		for (int row = 0; row < sizeX; row++) {
			for (int column = 0; column < sizeY; column++) {
				map[row][column] = new MapElement(row, column, edgelength,
						false);
			}
		}

		placeOccupieds();

		placeThymio();
		/**
		 * Kleiner Tipp! Random r = new Random(); ArrayList<Integer>
		 * occupiedElements = new ArrayList<Integer>();
		 */

		// TODO initialize each element of the map

		// TODO collect N distinct random numbers between 0 and the max number
		// of MapElements in this Map

		// TODO find MapElement corresponding to each of the numbers and set its
		// state to occupied

	}

	private void placeOccupieds() {
		occupiedElements = new ArrayList<Integer>();
		int index = 0;
		for (int num = 0; num < N; num++) {
			do {
				index = r.nextInt(sizeX * sizeY);
			} while (occupiedElements.contains(index));
			// System.out.println(index);
			occupiedElements.add(index);
		}

		for (int i : occupiedElements) {
			int indexRow = i / sizeY;
			int indexCol = i % sizeY;
			map[indexRow][indexCol].setOccupied(true);
		}
	}

	private void placeThymio() {
		int thymioPos;
		do {
			thymioPos = r.nextInt(sizeX * sizeY);
		} while (occupiedElements.contains(thymioPos));
		thymioX = thymioPos / sizeY;
		thymioY = thymioPos % sizeY;
		map[thymioX][thymioY].setThymio();
	}

	public void printMap() {
		String outputString = "";
		for (int row = 0; row < sizeY; row++) {
			outputString += "| ";
			for (int col = 0; col < sizeX; col++) {
				if (map[row][col].isOccupied()) {
					outputString += "X | ";
					// outputString += "X";
				} else if (map[row][col].hasThymio()) {
					outputString += "T | ";
					// outputString+="T;"
				} else if (map[row][col].isHitByBeam()) {
					outputString += "^ | ";
				} else {
					outputString += "- | ";
					// outputString+="-;"
				}

			}
			outputString += "\n";
		}
		System.out.println(outputString);
	}

	public void followBeam(int x1, int y1, int x2, int y2) {
		// TODO - nächste Woche
	}

	public int getThymioX() {
		return thymioX;
	}

	public int getThymioY() {
		return thymioY;
	}

	public int getSizeX() {
		return sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public boolean hitByLaserbeam(int thymX, int thymY) {
//		System.out.println("X: " + thymX+ "Y " + thymY);
		if(map[thymX][thymY].isOccupied()){
			return false;
		}else{
		map[thymX][thymY].hitByLaserBeam();
			return true;
		}
	}

}
