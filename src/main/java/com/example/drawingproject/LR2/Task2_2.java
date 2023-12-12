package com.example.drawingproject.LR2;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task2_2 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task2_2();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(1000, 750);
		pixelDensity(2);
		smooth();
	}

	@Override
	public void setup() {
		background(255);

		/*
		// centring
		translate(width / 2, height / 2);

		stroke(128);
		line(-width / 2, 0, width / 2, 0);  // x
		line(0, -height / 2, 0, height / 2);  // y

		 */
	}

	@Override
	public void draw() {
		final Matrix m = new Matrix(
			1, 2,
			3, 1
		);
		final Vector v1 = new Vector(
			50, 100,
			250, 200
		);
		final Vector v2 = new Vector(
			50, 200,
			250, 300
		);

		assert(Double.compare(v1.getSlant(), v2.getSlant()) == 0); // debug parallel check
		System.out.println("Slant before transform: " + v1.getSlant());
		System.out.println("Slant after transform: " + v2.getSlantAfterTransform(m));

		scale(0.7F);

		drawVector(v1, CustomColor.BLACK);
		drawVector(v2, CustomColor.GREY);

		drawVector(v1.transform(m), CustomColor.RED);
		drawVector(v2.transform(m), CustomColor.ORANGE);


		noLoop();
	}

	private void drawDot(Point p, CustomColor color) {
		final int R = 5;
		fill(color.getR(), color.getG(), color.getB());
		ellipse(p.getX(), p.getY(), R, R);
	}

	private void drawDotInfo(Point p, CustomColor color) {
		final int TAB = 10;
		fill(color.getR(), color.getG(), color.getB());
		text(p.toString(), p.getX() + TAB, p.getY());
	}

	private void drawLine(Point p1, Point p2, CustomColor color) {
		stroke(color.getR(), color.getG(), color.getB());
		line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	private void drawLine(Vector v, CustomColor color) {
		Point p1 = v.getP1();
		Point p2 = v.getP2();
		drawLine(p1, p2, color);
	}

	private void drawVector(Vector v, CustomColor color) {
		drawLine(v, color);

		drawDot(v.getP1(), color);
		drawDotInfo(v.getP1(), color);

		drawDot(v.getP2(), color);
		drawDotInfo(v.getP2(), color);
	}
}


