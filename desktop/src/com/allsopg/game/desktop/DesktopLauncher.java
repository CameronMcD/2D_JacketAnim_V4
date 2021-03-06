package com.allsopg.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.allsopg.game.MyGdxGame;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//config.height = 320;
		//config.width = 240;
		//TexturePacker.process("../assets/gfx/collision", "../assets/gfx/collision", "collision_assets");

		new LwjglApplication(new MyGdxGame(), config);
	}
}
