package my_sorting_algorithm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.*;

public class SortingGame extends Canvas {
	
	private TitleScreen title;
	Window window;
	public static final float WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	public enum STATE {
		Title,
		MainFrame,
	}
	
	public static STATE state = STATE.Title;
	
	public SortingGame() {
		title = new TitleScreen();
		new Window(WIDTH, HEIGHT, "Sorting", this);
	}
	
	public synchronized void stop() {
		try {
			// .join() stops the thread
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void start() {
		thread = new Thread();
		thread.start();
		running = true;
	}
	
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running) {
				render();
			}
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() {
		
	}
	
	private void render() {
		BufferStrategy b = this.getBufferStrategy();
		if (b == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = b.getDrawGraphics();
		title.render(g);
	}
	
	public static void main(String args[]) { 
		new SortingGame();
	}
	
	
	
}