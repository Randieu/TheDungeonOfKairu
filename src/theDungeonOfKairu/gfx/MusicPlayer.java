package theDungeonOfKairu.gfx;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class MusicPlayer{

	public static void playSound() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\R-Stu\\eclipse-workspace\\TheDungeonOfKairu\\Res\\Sounds\\TheWayDown.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.loop(80);
			clip.start();
		}catch(Exception ex) {
			System.out.println("Error with playing sound!");
			ex.printStackTrace();
		}
		
	}
	

}
