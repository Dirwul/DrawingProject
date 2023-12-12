package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Triangle {

	Point p1;

	Point p2;

	Point p3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
	}

	public Triangle transform(Matrix m) {
		return new Triangle(p1.transform(m), p2.transform(m), p3.transform(m));
	}

	public Triangle multiply(double val) {
		return new Triangle(p1.multiply(val), p2.multiply(val), p3.multiply(val));
	}

	@Override
	public String toString() {
		return "\n" + p1 + "\n" + p2 + "\n" + p3;
	}
}
