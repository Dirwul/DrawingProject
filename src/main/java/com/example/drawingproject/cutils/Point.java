package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;
import lombok.Setter;

import static com.example.drawingproject.DrawingProjectApplication.decimalFormat;
import static com.example.drawingproject.DrawingProjectApplication.in;

@AllArgsConstructor
@Setter
public class Point implements Comparable<Point> {

	double x;

	double y;

	/*
	The reason why we use float getX/getY is because of
		all custom structures are package-private (default)
	So, in 'cutils' we can use Point.x, in other program parts
		we wanna get float values to draw
	 */
	public float getX() {
		return (float)x;
	}

	public float getY() {
		return (float)y;
	}

	public Point transform(Matrix m) {
		double newX = x*m.a + y*m.c;
		double newY = x*m.b + y*m.d;
		return new Point(newX, newY);
	}

	public static Point read() {
		double x = in.nextDouble();
		double y = in.nextDouble();
		return new Point(x, y);
	}

	public static Point read(String text) {
		System.out.println(text);
		return read();
	}

	public Point multiply(double val) {
		return new Point(x * val, y * val);
	}

	@Override
	public String toString() {
		return "(%s, %s)".formatted(
			decimalFormat.format(x),
			decimalFormat.format(y)
		);
	}

	private int doubleCompare(double a, double b) { // debug method | ref 2-3
		final double EPS = 1e-9;
		double diff = a - b;
		if (Math.abs(diff) <= EPS) {
			return 0;
		}
		return Double.compare(diff, 0F); // never zero
	}

	@Override
	public int compareTo(Point second) {
		int xDiff = doubleCompare(x, second.x);
		int yDiff = doubleCompare(y, second.y);
		if (xDiff == 0 && yDiff == 0) {
			return 0;
		} else if (xDiff != 0) {
			return xDiff;
		}
		return yDiff;
	}
}
