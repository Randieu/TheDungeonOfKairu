package theDungeonOfKairu.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import theDungeonOfKairu.display.Display;
import theDungeonOfKairu.gfx.Assets;
import theDungeonOfKairu.states.BaseState;
import theDungeonOfKairu.states.BattleState;
import theDungeonOfKairu.states.GameState;
import theDungeonOfKairu.states.MenuState;
import theDungeonOfKairu.states.State;

public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	// States
	private State gameState;
	private State menuState;
	private State baseState;
	private State battleState;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	private void init() {
		display = new Display(title, width, height);
		Assets.init();
		
		gameState = new GameState();
		menuState = new MenuState();
		baseState = new BaseState();
		battleState = new BattleState();
		State.setState(menuState);
	}
	
	
	
	private void tick() {
		if(State.getState() != null)
			State.getState().tick();
			
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear screen!
		g.clearRect(0, 0, width, height);
		
		// Draw here!
		if(State.getState() != null)
			State.getState().render(g);
			
		
		// End Drawing!
		bs.show();
		g.dispose();
	}
	
	public void run() {
		
		init();
		
		int fps = 60; 	// this makes the game run at the same speed on different PC's (60FPS)
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks =0;
		
		
		
		while(running) { // The Game loop!
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
			tick();
			render();
			ticks ++;
			delta --;
			}
			
			if(timer >= 1000000000) {   	//FPS counter
				System.out.println("Ticks & Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
	}
		
		stop();
		
	}
	
	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		running = false;
	try {
		thread.join();
	}catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	
}
