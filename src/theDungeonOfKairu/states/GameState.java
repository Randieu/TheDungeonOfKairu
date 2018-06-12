package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.entities.creatures.Player;
import theDungeonOfKairu.floors.Floor;
import theDungeonOfKairu.game.Game;
import theDungeonOfKairu.tiles.Tile;

public class GameState extends State {

	private Player player;
	private Floor floor;

	public GameState(Game game) {
		super(game);
		player = new Player(game, 9 * Tile.TILEWIDTH, 10 * Tile.TILEHEIGHT);
		floor = new Floor(game, "Res/Floors/floor1.txt");
	
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
