package com.example.myplaylist.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.SeekBar;

import com.example.myplaylist.model.Song;

/**
 * Controller class for managing song's logic. It gives the functionality for play, pause and
 * stop and the progress of the SeekBar
 */
public class PlayMusicController {
    private Context ctx;
    private Song song;
    private MediaPlayer mp;
    //private SeekBar skbSongProgress;

    /**
     * Constructor for the controller. It receives the Context of the Activity where the controller
     * is going to work
     *
     * @param ctx The context of the Activity where the controller must work
     */
    public PlayMusicController(Context ctx){
        this.ctx = ctx;
    }

    /**
     * Plays the music when the Play Button is clicked.
     *
     * @param song The song which is going to be played
     */
    public void playMusic(Song song){
        if(mp == null){
            mp = MediaPlayer.create(ctx, song.getRawResource());
            mp.start();
        }else if (mp.isPlaying()){
            mp.stop();
            mp = MediaPlayer.create(ctx, song.getRawResource());
            mp.start();
        } else if (mp != null && !mp.isPlaying()) {
            mp.seekTo(mp.getCurrentPosition());
            mp.start();
        }
    }

    /**
     * Pauses the music when the Pause Button is clicked
     */
    public void pauseMusic(){
        if(mp != null && mp.isPlaying()){
            mp.pause();
        }
    }

    /**
     * Stops the music when the Stop Button is clicked. MediaPlayer is set to null in order to
     * re-assign the MediaPlayer for the new song to be played
     */
    public void stopMusic(){
        if(mp != null && mp.isPlaying()){
            mp.stop();
            mp = null;
        }
    }
}
