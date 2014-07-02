package context;

import java.util.ArrayList;
import java.util.Random;

public class Map {
	
	private int sizeX, sizeY; // number of elements in each direction 
							  // used to get a discrete model of the environment
	
	private MapElement [][] element; // Array of MapElement representing the environment
	private double edgelength; // each element in this maps covers edgelength^2 square units.
	
	public static final int N = 20; // number of occupied elements
	
	public Map(int x, int y, double l) {
		
		//TODO Zuweisung der Variablen
		
		initMap();
	}
	
	private void initMap() {
		/**Kleiner Tipp!
		* Random r = new Random();
		* ArrayList<Integer> occupiedElements = new ArrayList<Integer>();
		*/
		
		//TODO initialize each element of the map
		
		
		//TODO collect N distinct random numbers between 0 and the max number of MapElements in this Map
		
		
		//TODO find MapElement corresponding to each of the numbers and set its state to occupied
		
	}
	
	public void printMap() {
		//TODO print each Element (console)
	}

	public void followBeam( int x1, int y1, int x2, int y2 ) {
		//TODO - nächste Woche
	}
}
