package com.ali.script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class clickEvents {
	public static void mouseLeftClick() {
		try {
			Robot robot = new Robot();
			//left click
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("Left Click");
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
