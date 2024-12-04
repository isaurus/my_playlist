package com.example.myplaylist.controller;

import com.example.myplaylist.R;
import com.example.myplaylist.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongController {

    private List<Song> songList;

    public SongController(){
        songList = new ArrayList<>();
    }

    public List<Song> getAllSongs(){
        return songList;
    }

    public Song getSongById(Integer songId){
        return songList.get(songId);
    }

    public void createSong(Song song){
        songList.add(song);
    }

    public void updateSong(Integer songId, Song song){
        songList.set(songId, song);
    }

    public void deleteSong(Song song){
        songList.remove(song);
    }

    public void loadData(){
        songList.add(new Song(0,"Don't Dream It's Over", "Crowded House", R.drawable.crowded_house_dont_dream_is_over, R.raw.crowded_house_dont_dream_its_over));
        songList.add(new Song(1,"Life Could Be a Dream", "Sh-Boom", R.drawable.sh_boom_life_could_be_dream, R.raw.sh_boom_life_could_be_a_dream));
        songList.add(new Song(2,"Riders on the Storm", "Snoop Dogg", R.drawable.snoop_dogg_riders_on_the_storm, R.raw.snoop_dogg_riders_on_the_storm));
        songList.add(new Song(3, "Ma Meilleure Ennemie", "Stromae", R.drawable.stromae_pomme_ma_meilleure_ennemie, R.raw.stromae_pomme_ma_meilleure_ennemie));
        songList.add(new Song(4, "I Don't Want to Set the World on Fire", "The Ink Spots", R.drawable.the_ink_spots_i_dont_want_to_set_the_world_on_fire, R.raw.the_ink_spots_i_dont_want_to_set_the_world_on_fire));
        songList.add(new Song(5, "C.R.E.A.M.", "Wu Tang Clan", R.drawable.wu_tang_clan_cream, R.raw.wu_tang_clan_cream));
        songList.add(new Song(6, "Enemy", "Imagine Dragons", R.drawable.imagine_dragons_enemy, R.raw.imagine_dragons_enemy));
        songList.add(new Song(7,"Love Nwantiti", "cKay", R.drawable.ckay_love_nwantiti, R.raw.ckay_love_nwantiti
        ));
    }
}
