package theDungeonOfKairu.entities.creatures;

import theDungeonOfKairu.entities.Entity;
import theDungeonOfKairu.game.Game;

public abstract class Creature extends Entity {

	public static final int DEFAULT_HEALTH = 10;
	public static final int DEFAULT_CREATURE_WIDTH = 64,
							DEFAULT_CREATURE_HEIGHT = 64;
	
	protected int health;
	
	public Creature(Game game, int x, int y, int width, int height) {
		super(game, x, y, width, height);
		health = DEFAULT_HEALTH;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}


}
