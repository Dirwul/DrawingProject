package com.example.drawingproject; // todo

// -Dsun.java2d.metal=false

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

public class Task extends PApplet { // todo

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task(); // todo
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
		translate(width / 2F, height / 2F);

		stroke(128);
		line(-width / 2F, 0, width / 2F, 0);  // x
		line(0, -height / 2F, 0, height / 2F);  // y

		 */
	}

	@Override
	public void draw() {
		// centring
		translate(width / 2F, height / 2F);
		// scaling
		scale(0.7F);
		// define

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

	private void drawRectangle(Rectangle r, CustomColor color) {
		fill(color.getR(), color.getG(), color.getB(), 50);

		Point p1 = r.getP1();
		Point p2 = r.getP2();
		Point p3 = r.getP3();
		Point p4 = r.getP4();

		quad(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY(), p4.getX(), p4.getY());

		drawDot(p1, color);
		drawDotInfo(p1, color);

		drawDot(p2, color);
		drawDotInfo(p2, color);

		drawDot(p3, color);
		drawDotInfo(p3, color);

		drawDot(p4, color);
		drawDotInfo(p4, color);
	}
}


