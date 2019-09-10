package my_sorting_algorithm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class TitleScreen extends MouseAdapter {
	public TitleScreen() {
		
	}
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if (SortingGame.state == SortingGame.STATE.Title) {
			
		}
	}
	
	public void render(Graphics g) {
		if (SortingGame.state == SortingGame.STATE.Title) {
			Font fnt = new Font("helvetica", 1, 50);
			Font fnt2 = new Font("helvetica", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.black); 
			g.drawString("Sorting", 240, 70);
			
			g.setFont(fnt2);
			g.drawRect(210, 150, 200, 64);
			g.drawString("Play", 270, 190);
			
			g.drawRect(210, 250, 200, 64);
			g.drawString("Help", 270, 290);
			
			g.drawRect(210, 350, 200, 64);
			g.drawString("Quit", 270, 390);
		}
	}
}
 