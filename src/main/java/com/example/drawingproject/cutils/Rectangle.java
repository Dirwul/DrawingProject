package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Rectangle {

	Point p1;

	Point p2;

	Point p3;

	Point p4;

	public Rectangle(double x1, double y1, double x2, double y2,
					 double x3, double y3, double x4, double y4) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.p4 = new Point(x4, y4);
	}

	public Rectangle transform(Matrix m) {
		return new Rectangle(p1.transform(m), p2.transform(m),
			p3.transform(m), p4.transform(m));
	}

	public Point getMidPoint() {
		return new Vector(p1, p3).getMidPoint();
	}

	public Rectangle multiply(double val) {
		return new Rectangle(p1.multiply(val), p2.multiply(val), p3.multiply(val), p4.multiply(val));
	}
}
