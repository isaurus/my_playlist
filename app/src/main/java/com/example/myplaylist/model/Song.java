package com.example.myplaylist.model;

import android.widget.SeekBar;

public class Song {
    private int songId;
    private String songTitle;
    private String songAuthor;
    private int drawableResource;
    private int rawResource;

    public Song(){
    }

    public Song(int songId, String songTitle, String songAuthor, int drawableResource, int rawResource){
        setSongId(songId);
        setSongTitle(songTitle);
        setSongAuthor(songAuthor);
        setDrawableResource(drawableResource);
        setRawResource(rawResource);
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
     this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }

    public int getDrawableResource(){
        return drawableResource;
    }

    public void setDrawableResource(int drawableResource){
        this.drawableResource = drawableResource;
    }

    public int getRawResource(){
        return rawResource;
    }

    public void setRawResource(int rawResource){
        this.rawResource = rawResource;
    }
}
