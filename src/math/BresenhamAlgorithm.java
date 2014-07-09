package math;

import context.Map;

public class BresenhamAlgorithm {

	public BresenhamAlgorithm(double angle) {
		System.out.println(angle);
		this.angle = angle;
	}

	private int thymX, thymY;
	private double angle;

	public void calculateBresenham(Map map) {
		thymX = map.getThymioX();
		thymY = map.getThymioY();

		applyBresenham(map);

	}

	/* computing the map-elements to the first hit occupied element */
	private void applyBresenham(Map map) {
		double m = Math.sin(Math.toRadians(angle));
		double d = 0;
		if (angle >= 0 && angle < 90) {
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
			}
		} else if (angle >= 90 && angle < 180) {
			while (thymX > 0 && thymY < map.getSizeY()-1) {
				thymX--;
				d += m;
				if (d > 0.5) {
					thymY++;
					d--;
				}

				if (!map.hitByLaserbeam(thymX, thymY)) {
					break;
				}
			}

		} else if (angle >= 180 && angle < 270) {
			while (thymX > 0 && thymY > 0) {
				thymX--;
				d += m;
				if (d < -0.5) {
					thymY--;
					d++;
				}

				if (!map.hitByLaserbeam(thymX, thymY)) {
					break;
				}
			}
		} else {
			while (thymX < map.getSizeX()-1 && thymY > 0) {
				thymX++;
				d += m;
				if (d < -0.5) {
					thymY--;
					d++;
				}

				if (!map.hitByLaserbeam(thymX, thymY)) {
					break;
				}
			}
		}
	}
}
