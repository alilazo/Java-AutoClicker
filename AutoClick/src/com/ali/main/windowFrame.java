package com.ali.main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.ali.script.clickEvents;
import com.ali.script.rightClickHandler;

public class windowFrame implements ActionListener {
	clickEvents clickEV = new clickEvents();
	public static TextField speedField = new TextField();
	public static TextField clicksField = new TextField();
	public static JLabel DebugInfo = new JLabel("");
	static Panel pnl = new Panel();
	static Button startBtn = new Button("Start");
	static JLabel speedHelpLab = new JLabel("How Fast? Seconds...");
	static JLabel clickHelpLab = new JLabel("How Many Clicks?");
	public static boolean clicked = false;
	
	public windowFrame(JFrame frame, int width, int height) {
		//frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(pnl);
		frame.setTitle("Auto Clicker");
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		speedHelpLab.setBounds(140, 0, 200, 30);
		speedField.setBounds(width/2-20, 40, 40, 22);
		
		clickHelpLab.setBounds(150 , 70, 200, 30);
		clicksField.setBounds(width/2-20, 100, 40, 22);
		
		startBtn.setBounds(width/2-40 , 140, 80, 30);
		
		DebugInfo.setBounds(110 , 180, 200, 30);

		pnl.add(speedHelpLab);
		pnl.add(speedField);
		
		pnl.add(clickHelpLab);
		pnl.add(clicksField);
		
		pnl.add(startBtn);
		pnl.add(DebugInfo);
		
		startBtn.addActionListener(this);
		
		//background
		new rightClickHandler();
		ColorParameters(frame);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void ColorParameters(JFrame frame) {
		
		DebugInfo.setForeground(Color.RED);
		DebugInfo.setFont(new Font("Comic Sans", Font.BOLD, 16));
		
		speedHelpLab.setForeground(Color.WHITE);
		speedHelpLab.setFont(new Font("Comic Sans", Font.BOLD, 12));
		
		clickHelpLab.setForeground(Color.WHITE);
		clickHelpLab.setFont(new Font("Comic Sans", Font.BOLD, 12));
		
		frame.setBackground(Color.GRAY);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//int seconds = Integer.parseInt(secondsField.getText());
		DebugInfo.setText("Click Anywhere To Start");
		clicked = true;

	}
}
