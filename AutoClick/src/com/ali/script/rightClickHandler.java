package com.ali.script;

import java.awt.AWTEvent;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;

import com.ali.main.windowFrame;

public class rightClickHandler {
	
	public static boolean focused = true;
	public static int mouseX;
	public static int mouseY;
	
	public rightClickHandler() {
		Toolkit.getDefaultToolkit().addAWTEventListener(new Listener(), AWTEvent.MOUSE_EVENT_MASK | AWTEvent.FOCUS_EVENT_MASK);
	}
	
	private static class Listener implements AWTEventListener {
		@Override
		public void eventDispatched(AWTEvent event) {
			//System.out.println(event.getSource());
			if(event.getID() == 1005 && windowFrame.clicked) {
				mouseX = MouseInfo.getPointerInfo().getLocation().x;
				mouseY = MouseInfo.getPointerInfo().getLocation().y;
				System.out.println(mouseX + " " + mouseY);
				
				focused = false;
				
				double speed = Double.parseDouble(windowFrame.speedField.getText());
				int clicks = Integer.parseInt(windowFrame.clicksField.getText());
				
				int x = rightClickHandler.mouseX;
				int y = rightClickHandler.mouseY;
				
				for(int i = 1; i <= clicks; i++) {
					new pointerPosition(x, y);
					clickEvents.mouseLeftClick();
					try {
						Thread.sleep((long) (speed*1000)); //conversion from sec to milli
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n\tAll Done!.. clicked " + clicks + " Times");
				windowFrame.DebugInfo.setText("DONE");
				windowFrame.clicked = false;
			} else {
				focused = true;
			}
			//System.out.println(focused);
		}
	}
}

