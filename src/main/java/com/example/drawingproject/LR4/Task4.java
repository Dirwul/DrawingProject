package com.example.drawingproject.LR4;

import processing.core.PApplet;
import com.example.drawingproject.cutils.*;

import java.util.Random;

public class Task4 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task4();
		PApplet.runSketch(processingArgs, mySketch);
	}

	@Override
	public void settings() {
		size(1000, 800);
		pixelDensity(2);
		smooth();
	}

	@Override
	public void setup() {
		background(255);

		frameRate(1);
	}

	@Override
	public void draw() {
		// define
		final double M = 0.90;
		Rectangle rect = new Rectangle(
			2, 0.5,
			8, 0.5,
			8, 6.5,
			2, 6.5
		).multiply(100);
		final Matrix m = new Matrix(
			M, 0,
			0, M
		);
		final float PI = acos(-1);
		final float alpha = PI/64;
		final Matrix mRotate = new Matrix(
			cos(alpha), sin(alpha),
			-sin(alpha), cos(alpha)
		);

		CustomColor[] colors = CustomColor.values();
		Random random = new Random();
		int iColor = random.nextInt(colors.length);

		for (int i = 0; i < 50; i++) {
			if (colors[iColor % colors.length] == CustomColor.WHITE) {
				iColor++;
			}
			CustomColor curColor = colors[iColor % colors.length];
			drawRectangle(getCentringRect(rect), curColor);

			rect = rect.transform(m).transform(mRotate);

			iColor += random.nextInt(colors.length);
		}

		//noLoop();
	}

	private Rectangle getCentringRect(Rectangle rect) {
		float centerX = (float) ((rect.getP1().getX() + rect.getP3().getX()) / 2);
		float centerY = (float) ((rect.getP1().getY() + rect.getP3().getY()) / 2);

		return new Rectangle(
			rect.getP1().getX() - centerX + width / 2F, rect.getP1().getY() - centerY + height / 2F,
			rect.getP2().getX() - centerX + width / 2F, rect.getP2().getY() - centerY + height / 2F,
			rect.getP3().getX() - centerX + width / 2F, rect.getP3().getY() - centerY + height / 2F,
			rect.getP4().getX() - centerX + width / 2F, rect.getP4().getY() - centerY + height / 2F
		);
	}



	@Override
	public void keyPressed() {
		if (keyCode == ESC) {
			exit();
		}
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

		Point p1 = r.getP1();
		Point p2 = r.getP2();
		Point p3 = r.getP3();
		Point p4 = r.getP4();

		fill(color.getR(), color.getG(), color.getB(), 50);
		quad(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY(), p4.getX(), p4.getY());

		drawDot(p1, color);
		//drawDotInfo(p1, color);

		drawDot(p2, color);
		//drawDotInfo(p2, color);

		drawDot(p3, color);
		//drawDotInfo(p3, color);

		drawDot(p4, color);
		//drawDotInfo(p4, color);
	}
}


