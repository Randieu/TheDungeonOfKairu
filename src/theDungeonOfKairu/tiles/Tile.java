package theDungeonOfKairu.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

	
	
	// Static stuff here
	
	public static Tile[] tiles = new Tile[256];
	public static Tile darkTile = new DarkTile(0);
	public static Tile pathTile = new PathTile(1);
	public static Tile wallTile = new WallTile(2);
	public static Tile baseTile = new BaseTile(3);
	
	
	// Class
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected BufferedImage texture2;
	protected final int id;
	
	public Tile(BufferedImage texture, BufferedImage texture2, int id) {
		this.texture = texture;
		this.texture2 = texture2;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public boolean isExplored() {
		return false;
	}
	
	public int getId() {
		return id;
	}
	
}
