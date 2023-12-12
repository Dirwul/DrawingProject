package com.example.drawingproject.cutils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CustomColor {
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255),
	BLACK(0, 0, 0),
	WHITE(255, 255, 255),
	GREY(128, 128, 128),
	ORANGE(255, 128, 0),
	PINK(255, 128, 128),
	SKY(128, 255, 255),
	LAVENDER(128, 128, 255),
	YELLOW(200, 200, 40)
	;

	private final int r;
	private final int g;
	private final int b;

}

