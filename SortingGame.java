package my_sorting_algorithm;

import java.awt.Canvas;

import javax.swing.*;

public class SortingGame extends Canvas {
	
	static TitleScreen title;
	Window window;
	public static final float WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	public enum STATE {
		Title,
		MainFrame,
	}
	
	public static STATE state = STATE.Title;
	
	public SortingGame() {
		title = new TitleScreen();
		
		new Window(WIDTH, HEIGHT, "Sorting", this);
	}
	
	public static void main(String args[]) { 
		SortingGame start = new SortingGame();
	}
	
	
	
}