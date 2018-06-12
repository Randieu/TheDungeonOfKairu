package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.gfx.Assets;

public class MenuState extends State{

	@Override
	public void tick() {
	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_start, 0, 0, null);
		
	}

}
