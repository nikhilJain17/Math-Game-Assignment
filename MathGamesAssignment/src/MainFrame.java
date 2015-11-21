/*
 * Nikhil Jain
 * Math Games Assignment November
 * Trigonometry
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import java.swing.

public class MainFrame extends JFrame {
	
	// to calculate each value
	JButton sineButton;
	JButton cosineButton;
	JButton tanButton;
	
	// textbox to hold user's input
	JTextArea userInputTA;
	
	// label to show answer
	JLabel answerLabel;
	
	
	// constructor
	public MainFrame() {
		
		sineButton = new JButton("sine");
		cosineButton = new JButton("cosine");
		tanButton = new JButton("tan");
		
		userInputTA = new JTextArea();
	
		answerLabel = new JLabel("Do not read");
		
		sineButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double userInput = Double.parseDouble(userInputTA.getText().toString());
				String answer = Double.toString(Math.sin(userInput));
				
				answerLabel.setText(answer);
				
			} // end of actionPerformed
			
		}); // end of sineButtonListener
		
		cosineButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double userInput = Double.parseDouble(userInputTA.getText().toString());
				String answer = Double.toString(Math.cos(userInput));
				
				answerLabel.setText(answer);
				
			} // end of actionPerformed
			
		});
		
		tanButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double userInput = Double.parseDouble(userInputTA.getText().toString());
				String answer = Double.toString(Math.tan(userInput));
				
				answerLabel.setText(answer);
				
			} // end of actionPerformed
			
		});
		
	} // end of constructor
	
	// initialize the goods
	public void setUpGui() {
		
		
		this.setLayout(new GridLayout(2,2));
		this.add(sineButton);
		this.add(cosineButton);
		this.add(tanButton);
		this.add(userInputTA);
		this.add(answerLabel);
		
		this.setBounds(0, 0, 500, 500);
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		
	} // end of setUpGui
	
} // end of class
