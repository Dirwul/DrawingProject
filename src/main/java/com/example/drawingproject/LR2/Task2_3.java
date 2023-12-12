package com.example.drawingproject.LR2;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task2_3 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task2_3();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(800, 800);
		pixelDensity(2);
		smooth();
	}

	@Override
	public void setup() {
		background(255);
	}

	@Override
	public void draw() {
		// centring
		translate(width / 2F, height / 2F);
		// scaling
		scale(0.7F);
		// define
		final int K = 100;
		final Vector v1 = new Vector(
			-1/2D, 3/2D,
			3, -2
		).multiply(K);
		final Vector v2 = new Vector(
			-1, -1,
			3, 5/3D
		).multiply(K);
		final Matrix m = new Matrix(
			1, 2,
			1, -3
		);

		System.out.println(v1);
		System.out.println(v2);

		Vector v1t = v1.transform(m);
		Vector v2t = v2.transform(m);

		// drawing
		drawVector(v1, CustomColor.BLACK);
		drawVector(v2, CustomColor.BLACK);

		drawVector(v1t, CustomColor.LAVENDER);
		drawVector(v2t, CustomColor.LAVENDER);

		noLoop();
	}

	private void drawDot(Point p, CustomColor color) {
		final int R = 5;
		fill(color.getR(), color.getG(), color.getB());
		ellipse(p.getX(), p.getY(), R, R);
	}

	private void drawDotInfo(Point p, CustomColor color) {
		final int TAB = 5;
		fill(color.getR(), color.getG(), color.getB());
		text(p.toString(), p.getX() + TAB, p.getY() - TAB);
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


