package theDungeonOfKairu.entities.creatures;

import java.awt.Graphics;

import theDungeonOfKairu.gfx.Assets;

public class Player extends Creature {

	public Player(float x, float y) {
		super(x, y);
		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one,(int) x,(int) y, null);
		
	}

}
