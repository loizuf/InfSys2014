package math;

import context.Map;

public class BresenhamAlgorithm {

	public BresenhamAlgorithm(double angle) {
		System.out.println("angle " + angle);
		this.angle = angle;
	}

	private int thymX, thymY;
	private double m, angle;

	public int[][] calculateBresenham(Map map) {
		thymX = map.getThymioX();
		thymY = map.getThymioY();

		applyBresenham(map);

		return null;
	}

	private int applyBresenham(Map map) {
		double m = Math.sin(Math.toRadians(angle));
		double d = 0;
		while (thymX < map.getSizeX() - 1 && thymY < map.getSizeY() - 1) {
			thymX++;
			d += m;
			if (d > 0.5) {
				thymY++;
				d--;
			}
			System.out.println("x " + thymX + ";y " + thymY + ";d " + d + ";m "
					+ m);
			if (!map.hitByLaserbeam(thymX, thymY)) {
				break;
			}
			;
		}
		return 0;
	}
}
