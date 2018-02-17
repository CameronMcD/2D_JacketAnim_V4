package com.allsopg.game.sound;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.IntMap;

/**
 * Created by Cam on 17/02/2018.
 */

public class SoundLink {
    private IntMap<Sound> soundKeys;

    public SoundLink(){

        soundKeys = new IntMap<Sound>();

        Sound diamondSnd = Gdx.audio.newSound(Gdx.files.internal("../assets/sfx/diamond.ogg"));

        soundKeys.put(1,diamondSnd);

    }

    public boolean play(int keyCode){
        Sound sound = soundKeys.get(keyCode);
        if (sound != null){
            sound.play();
            return true;
        }
        return false;
    }

    public void dispose(){
        for(Sound sound : soundKeys.values()){
            sound.dispose();
        }
    }
}
