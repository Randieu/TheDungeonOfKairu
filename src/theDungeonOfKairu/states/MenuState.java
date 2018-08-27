package theDungeonOfKairu.states;

import java.awt.Graphics;

import theDungeonOfKairu.game.Handler;
import theDungeonOfKairu.gfx.Assets;
import theDungeonOfKairu.gfx.MusicPlayer;
import theDungeonOfKairu.ui.ClickListener;
import theDungeonOfKairu.ui.UIImagebutton;
import theDungeonOfKairu.ui.UIManager;

public class MenuState extends State{

	private UIManager uiManager;
	
	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);	
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImagebutton(200, 200, 128, 64, Assets.btn_start, new ClickListener(){

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
				MusicPlayer.playSound();
				}
			}));
	}

	@Override
	public void tick() {	
		uiManager.tick();
		
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
