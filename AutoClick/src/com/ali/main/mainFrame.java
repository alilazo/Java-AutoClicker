package com.ali.main;

import javax.swing.JFrame;

public class mainFrame {
	static int width = 400;
	static int height = 250;
	
	public static void main(String args[]) throws InterruptedException {
		JFrame frame = new JFrame();
		//new rightClickHandler();
		new windowFrame(frame, width, height);
	   
	}
}