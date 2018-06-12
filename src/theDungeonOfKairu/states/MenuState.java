package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.game.Handler;
import theDungeonOfKairu.gfx.Assets;

public class MenuState extends State{

	public MenuState(Handler handler) {
		super(handler);
		
	}

	@Override
	public void tick() {	
	if(handler.getMouseManager().isLeftPressed())
		State.setState(handler.getGame().gameState);
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_start, 0, 0, null);
		
	}

}
