package com.example.drawingproject.LR2;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task2_5 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task2_5();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(800, 600);
		pixelDensity(2);
		smooth();
	}

	@Override
	public void setup() {
		background(255);

		/*
		// centring
		translate(width / 2F, height / 2F);

		stroke(128);
		line(-width / 2F, 0, width / 2F, 0);  // x
		line(0, -height / 2F, 0, height / 2F);  // y

		 */
	}

	@Override
	public void draw() {
		// centring
		//translate(width / 2F, height / 2F);
		// scale
		scale(0.7F);

		// define
		final Triangle triangle = new Triangle(
			8, 1,
			7, 3,
			6, 2
		).multiply(100);
		final Matrix m = new Matrix(
			0, 1,
			1, 0
		);

		drawTriangle(triangle, CustomColor.BLACK);
		drawTriangle(triangle.transform(m), CustomColor.RED);

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

	private void drawTriangle(Triangle t, CustomColor color) {
		fill(color.getR(), color.getG(), color.getB(), 50);

		Point p1 = t.getP1();
		Point p2 = t.getP2();
		Point p3 = t.getP3();

		triangle(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());

		drawDot(p1, color);
		drawDotInfo(p1, color);

		drawDot(p2, color);
		drawDotInfo(p2, color);

		drawDot(p3, color);
		drawDotInfo(p3, color);
	}
}


