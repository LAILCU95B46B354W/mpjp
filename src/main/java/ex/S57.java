package ex;

public class S57 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {

		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		var a = (x1 - x0);
		var b = (y1 - y0);

		var c = Math.pow(a, 2);
		var d = Math.pow(b, 2);

		return Math.sqrt(c + d);
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		var b = Math.pow((bore / 2), 2);
		var c = Math.PI;
		var d = stroke;
		var e = b * c * d;
		var f = e / 1000;

		return f * nr;
	}

	// somma delle cifre in un numero
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		int counter = 0;
		value = Math.abs(value);

		while (value != 0) {
			counter = counter + (value % 10); // counter += value %10;
			value = value / 10; // value /= 10;
		}

		return counter;
	}
}
