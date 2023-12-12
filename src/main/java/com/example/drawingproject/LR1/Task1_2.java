package com.example.drawingproject.LR1;

import processing.core.PApplet;

public class Task1_2 extends PApplet {

	public void init() {
		String[] processingArgs = {"Task"};
		var mySketch = new Task1_2();
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

		fill(255, 0, 0);  // красный
		rect(50, 50, 100, 100);

		fill(0, 255, 0);  // зеленый
		ellipse(200, 200, 80, 80);

		stroke(0, 0, 255);  // синий
		line(300, 300, 350, 350);

		// точка
		fill(0); // черный
		noStroke();
		ellipse(100, 200, 10, 10);

		fill(255, 0, 255);  // фиолетовый
		triangle(250, 150, 300, 50, 350, 150);

		fill(0);  // черный
		textSize(20);
		text("Текстик", 50, 350);
	}
}
