package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Vector {

	Point p1;

	Point p2;

	public Vector(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	public static Vector read() {
		Point p1 = Point.read();
		Point p2 = Point.read();
		return new Vector(p1, p2);
	}

	public static Vector read(String text) {
		System.out.println(text);
		return Vector.read();
	}

	public Vector transform(Matrix m) {
		Point newPoint1 = p1.transform(m);
		Point newPoint2 = p2.transform(m);
		return new Vector(newPoint1, newPoint2);
	}

	public Vector multiply(double val) {
		return new Vector(p1.multiply(val), p2.multiply(val));
	}

	public Point getMidPoint() {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

	public double getDist() { // debug method | ref 2_3
		return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
	}

	public double getAngleBetween(Vector v2) {
		double angle1 = Math.atan2(p2.y - p1.y, p2.x - p1.x);
		double angle2 = Math.atan2(v2.p2.y - v2.p1.y, v2.p2.x - v2.p1.x);

		double angle = Math.abs(Math.toDegrees(angle2 - angle1));
		angle = Math.min(angle, 180 - angle);

		return angle;
	}

	public double getSlant() {
		return (p2.y - p1.y) / (p2.x - p1.x);
	}

	public double getSlantAfterTransform(Matrix m) {
		return (m.b + m.d * getSlant()) / (m.a + m.c * getSlant());
	}

	@Override
	public String toString() {
		//return "\n" + p1 + "\n" + p2;
		return p1 + " <-> " + p2;
	}
}
