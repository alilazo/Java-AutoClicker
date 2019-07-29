package com.ali.script;

import java.awt.AWTException;
import java.awt.Robot;

public class pointerPosition {
	
	public int x, y;
	
	public pointerPosition(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			Robot robot = new Robot();
			robot.mouseMove(x, y);
			System.out.println("Moved to: " + x + ", " + y);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
