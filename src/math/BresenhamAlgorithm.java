package math;

import context.Map;

public class BresenhamAlgorithm {

	public BresenhamAlgorithm(double angle) {
		System.out.println("angle " + angle);
		this.angle = angle;
	}

	private int thymX, thymY;
	private double m, angle;

	
	public void calculateBresenham(Map map) {
		thymX = map.getThymioX();
		thymY = map.getThymioY();

		applyBresenham(map);

	}
	/* computing the map-elements to the first hit occupied element */
	private void applyBresenham(Map map) {
		double m = Math.sin(Math.toRadians(angle));
		double d = 0;
		while (thymX < map.getSizeX() - 1 && thymY < map.getSizeY() - 1) {
			thymX++;
			d += m;
			if (d > 0.5) {
				thymY++;
				d--;
			}
			
			if (!map.hitByLaserbeam(thymX, thymY)) {
				break;
			}
			;
		}
	}
}
