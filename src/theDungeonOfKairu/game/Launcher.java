package theDungeonOfKairu.game;

public class Launcher {
	
	// This will launch any display created
		public static void main(String[] args) {
		Game game = new Game("The Dungeon of Kairu", 1024, 640);
		game.start();
		}	
	
}
