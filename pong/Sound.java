package pong;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 * Created by asus pc on 10/21/2016.
 */
// class for the sound effect implementations of the game! hahah!
public class Sound {
    // sound files must be in the same directory/package for this implementations
    public static final AudioClip BALL = Applet.newAudioClip(Sound.class.getResource("tutorial1.wav"));
    public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("tutorial2.wav"));
    public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("tutorial3.wav"));
}
