package com.example.drawingproject.LR1;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task1_4 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task1_4();
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

		Vector v1 = Vector.read("Введите вектор:");
		Vector v2 = v1.transform(m);

		System.out.println("Income vector: " + v1);
		System.out.println("Matrix" + m);
		System.out.println("Transformed vector: " + v2);

		drawVector(v1, CustomColor.RED);
		drawVector(v2, CustomColor.LAVENDER);

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

	private void drawVector(Vector v, CustomColor color) {
		drawLine(v.getP1(), v.getP2(), color);

		drawDot(v.getP1(), color);
		drawDotInfo(v.getP1(), color);

		drawDot(v.getP2(), color);
		drawDotInfo(v.getP2(), color);
	}
}