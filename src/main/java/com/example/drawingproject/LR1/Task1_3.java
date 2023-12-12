package com.example.drawingproject.LR1;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task1_3 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task1_3"};
		var mySketch = new Task1_3();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(600, 400);
	}

	@Override
	public void setup() {
		background(255);
	}

	@Override
	public void draw() {
		final int R = 5;
		final int TAB = 10;
		final Matrix m = new Matrix(
			1, 3,
			4, 1
		);

		Point p = Point.read("Введите точку:");
		Point p2 = p.transform(m);


		fill(255, 0, 0);
		ellipse(p.getX(), p.getY(), R, R);
		fill(255, 0, 0);
		text("Original: " + p, p.getX() + TAB, p.getY());


		fill(0, 0, 255);
		ellipse(p2.getX(), p2.getY(), R, R);
		fill(0, 0, 255);
		text("Transformed:" + p2, p2.getX() + TAB, p2.getY());

		noLoop();
	}
}