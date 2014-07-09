package main;

import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;

import math.BresenhamAlgorithm;
import thymio.Thymio;
import context.Map;

public class MainController extends JFrame {
	private static final long serialVersionUID = 1L;
	// private ObserverThread observer; // Brauchen wir erst nächste Woche
	private Map myMap;
	private Thymio myThymio;
	private BresenhamAlgorithm bresenham;

	public static final int MAPSIZE_X = 20;
	public static final int MAPSIZE_Y = 20;
	public static final double LENGTH = 10.0;

	public MainController() {
		super();
		this.setMinimumSize(new Dimension(400, 400));
		this.pack();

	}

	public void init() {
		Random r = new Random();
		double angle = 90.0 * r.nextDouble();
		
		myMap = new Map(MAPSIZE_X, MAPSIZE_Y, LENGTH);
		myThymio = new Thymio(myMap.getThymioX(), myMap.getThymioY(), angle);
		// TODO Thmyio: "Auf die Map setzen (zufällig!) und Orientierung geben"
		bresenham = new BresenhamAlgorithm(myThymio.getAngle());
	}

	public void run() {
		bresenham.calculateBresenham(myMap);
		myMap.printMap();
		// TODO Map ausgeben
	}

	public static void main(String[] args) {
		MainController mc = new MainController();
		mc.init();
		mc.run();
	}
}
