package theDungeonOfKairu.gfx;

import java.awt.image.BufferedImage;


public class Assets {
private static final int width = 64, height = 64;
	
	public static BufferedImage p_one, p_darktile, p_walltile, p_four, p_five, p_start;

	public static BufferedImage[] btn_start; 
	
	//If you want to have animations you can do that with an Array
	
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Textures/TestSpriteOne.png"));
		
		btn_start = new BufferedImage[2];
		btn_start[0] = sheet.crop(width * 2, height * 3, width, height);
		btn_start[1] = sheet.crop(width * 3, height * 3, width, height);
		
		
		p_one = sheet.crop(0, 0, width, height);
		p_darktile = sheet.crop(width * 3, 0, width, height);
		p_walltile = sheet.crop(width * 2, 0, width, height);
		p_four = sheet.crop(width * 3, height * 2, width, height);
		p_five = sheet.crop(0, height, width, height);
		p_start = sheet.crop(width * 3, height * 3, width, height);
	}
}
