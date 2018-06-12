package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.entities.creatures.Player;
import theDungeonOfKairu.floors.Floor;
import theDungeonOfKairu.game.Handler;
import theDungeonOfKairu.tiles.Tile;

public class GameState extends State {

	private Player player;
	private Floor floor;

	public GameState(Handler handler) {
		super(handler);
		floor = new Floor(handler, "Res/Floors/floor1.txt");
		handler.setFloor(floor);
		player = new Player(handler, 9 * Tile.TILEWIDTH, 10 * Tile.TILEHEIGHT);
		
	
	}
	
	
	@Override
	public void tick() {
	floor.tick();
	player.tick();
	
	}

	@Override
	public void render(Graphics g) {
	floor.render(g);
	player.render(g);
	
		
	}

}
