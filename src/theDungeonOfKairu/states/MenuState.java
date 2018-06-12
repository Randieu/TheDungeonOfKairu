package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.game.Game;
import theDungeonOfKairu.gfx.Assets;

public class MenuState extends State{

	public MenuState(Game game) {
		super(game);
		
	}

	@Override
	public void tick() {
	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_start, 0, 0, null);
		
	}

}
