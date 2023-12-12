package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;

import static com.example.drawingproject.DrawingProjectApplication.decimalFormat;


@AllArgsConstructor
public class Matrix {

	double a;

	double b;

	double c;

	double d;

	public Matrix(Point p1, Point p2) {
		this.a = p1.x;
		this.b = p1.y;
		this.c = p2.x;
		this.d = p2.y;
	}

	@Override
	public String toString() {
		return "\n%s %s\n%s %s".formatted(
			decimalFormat.format(a), decimalFormat.format(b),
			decimalFormat.format(c), decimalFormat.format(d)
		);
	}
}
