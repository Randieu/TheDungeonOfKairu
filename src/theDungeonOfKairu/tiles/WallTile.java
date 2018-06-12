package theDungeonOfKairu.tiles;

import theDungeonOfKairu.gfx.Assets;

public class WallTile extends Tile{

	public WallTile(int id) {
		super(Assets.p_walltile, id);
		
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
