package theDungeonOfKairu.entities.creatures;

import java.awt.Graphics;

import theDungeonOfKairu.game.Handler;
import theDungeonOfKairu.gfx.Assets;

public class Player extends Creature {

	
	public Player(Handler handler, int x, int y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
	}

	@Override
	public void tick() {
	handler.getGameCamera().centerOnEntity(this);	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one, (int)(x - handler.getGameCamera().getxOffset()), 
				(int)(y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

}
