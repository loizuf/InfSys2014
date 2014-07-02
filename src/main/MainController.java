package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

import context.Map;

import observer.ObserverThread;
import thymio.Thymio;

public class MainController extends JFrame {
	private static final long serialVersionUID = 1L;
	// private ObserverThread observer;  // Brauchen wir erst nächste Woche
	private Map myMap;
	private Thymio myThymio;
	
	public static final int MAPSIZE_X = 20;
	public static final int MAPSIZE_Y = 20;
	public static final double LENGTH = 10.0;
	
	public MainController() {
		super();
		this.setMinimumSize(new Dimension(400, 400));
		this.pack();
		
		//TODO Map erstellen und Thymio aufsetzen
		
	}
	
	
	public void init() {
		//TODO Thmyio: "Auf die Map setzen (zufällig!) und Orientierung geben"
	}
	
	public void run() {
		//TODO Map ausgeben	
	}
		
	public static void main(String [] args) {
		MainController mc = new MainController();
		mc.init();
		mc.run();
	}
}
