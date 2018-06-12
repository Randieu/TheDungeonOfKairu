package theDungeonOfKairu.entities.creatures;

import java.awt.Graphics;

import theDungeonOfKairu.game.Game;
import theDungeonOfKairu.gfx.Assets;

public class Player extends Creature {

	
	public Player(Game game, int x, int y) {
		super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
	}

	@Override
	public void tick() {
	game.getGameCamera().centerOnEntity(this);	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one, (int)(x - game.getGameCamera().getxOffset()), 
				(int)(y - game.getGameCamera().getyOffset()), width, height, null);
		
	}

}
