package com.trong.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.trong.game.FlappyBird;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
//		config.setForegroundFPS(60);
		config.setTitle(FlappyBird.TITLE);
		config.setWindowedMode(FlappyBird.WIDTH, FlappyBird.HEIGHT);
		
		new Lwjgl3Application(new FlappyBird(), config);
	}
}
