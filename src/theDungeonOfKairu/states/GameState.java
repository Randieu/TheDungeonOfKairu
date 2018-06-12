package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.entities.creatures.Player;
import theDungeonOfKairu.tiles.Tile;

public class GameState extends State {

	private Player player;
	
	public GameState() {
		player = new Player(100, 100);
	}
	
	@Override
	public void tick() {
	player.tick();
		
	}

	@Override
	public void render(Graphics g) {
	player.render(g);
	Tile.tiles[0].render(g, 0, 0);
		
	}

}
