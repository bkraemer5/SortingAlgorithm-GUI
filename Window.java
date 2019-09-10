package my_sorting_algorithm;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	public Window(float width, float height, String title, SortingGame sortingGame) {
		
		JFrame myFrame = new JFrame(title);
		
		myFrame.setPreferredSize(new Dimension((int)width, (int)height));
		myFrame.setMinimumSize(new Dimension((int)width, (int)height));
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setLocationRelativeTo(null); 
		myFrame.setResizable(false);
		myFrame.add(sortingGame);
		myFrame.setVisible(true);
		
		
	}
	
}
