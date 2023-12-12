package com.example.drawingproject.LR2;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task2_1 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task2_1();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(1000, 750);
	}

	@Override
	public void setup() {
		background(255);
	}

	@Override
	public void draw() {
		final double eps = 1e-6;
		final Matrix m = new Matrix(
			1, 2,
			3, 1
		);
		Vector v1 = new Vector(
			0, 100,
			200, 300
		);

		Vector v2 = v1.transform(m);

		Point midPoint1 = v1.getMidPoint();
		Point midPoint2 = midPoint1.transform(m);

		Point synthMidPoint = v2.getMidPoint(); // debug
		assert(midPoint2.compareTo(synthMidPoint) == 0); // debug

		drawLine(v1, CustomColor.ORANGE);
		drawLine(v2, CustomColor.LAVENDER);

		drawDot(midPoint1, CustomColor.GREY);
		drawDot(midPoint2, CustomColor.GREY);

		drawDotInfo(midPoint1, CustomColor.GREY);
		drawDotInfo(midPoint2, CustomColor.GREY);

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


