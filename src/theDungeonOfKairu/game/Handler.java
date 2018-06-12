package theDungeonOfKairu.game;

import theDungeonOfKairu.floors.Floor;
import theDungeonOfKairu.gfx.GameCamera;
import theDungeonOfKairu.input.MouseManager;

public class Handler {

	private Game game;
	private Floor floor;
	
	public Handler(Game game) {
		this.game = game;
	}

	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
}
