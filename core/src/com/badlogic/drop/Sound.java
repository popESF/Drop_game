package com.badlogic.drop;

import com.badlogic.gdx.Gdx;

public class Sound {
    public static void music() {
        com.badlogic.gdx.audio.Sound cryMusic;
        cryMusic = Gdx.audio.newSound(Gdx.files.internal("\\\\userfs\\pf693\\w2k\\Desktop\\test2\\assets\\cry.wav"));
        cryMusic.play();
    }
}



