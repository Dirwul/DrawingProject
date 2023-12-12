package com.example.drawingproject;

import com.example.drawingproject.LR1.*;
import com.example.drawingproject.LR2.*;
import com.example.drawingproject.LR3.*;
import com.example.drawingproject.LR4.*;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * @author dirwul
 */

public class DrawingProjectApplication {

	public static final Scanner in = new Scanner(System.in);
	public static final DecimalFormat decimalFormat = new DecimalFormat("#.#");

	public static void main(String[] args) {
		new Task4().init();
	}
}
