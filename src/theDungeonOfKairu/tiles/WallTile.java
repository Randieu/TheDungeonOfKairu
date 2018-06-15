package theDungeonOfKairu.tiles;

import java.awt.image.BufferedImage;

import theDungeonOfKairu.gfx.Assets;

public class WallTile extends Tile{

	
	public WallTile(int id) {
		super(Assets.p_walltile, Assets.p_darktile, id);
		
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	

}
