package com.example.drawingproject.LR1;

import com.example.drawingproject.cutils.*;

public class Task1_1 {

	void run() {
		Matrix m = new Matrix(
			1, 3,
			4, 1
		);
		Point p = Point.read("Введите координаты точки:");
		System.out.println("Изначальная точка: " + p);
		System.out.println("Точка после преобразования: " + p.transform(m).toString());
		System.out.println("Матрица преобразования: " + m);
	}

	public void init() {
		run();
	}
}
