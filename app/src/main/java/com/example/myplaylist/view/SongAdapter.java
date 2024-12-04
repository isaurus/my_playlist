package com.example.myplaylist.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myplaylist.R;
import com.example.myplaylist.controller.PlayMusicController;
import com.example.myplaylist.controller.SongController;
import com.example.myplaylist.model.Song;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    Context ctx;
    SongController songController;
    PlayMusicController pmController;

    public SongAdapter(Context ctx, SongController songController){
        this.ctx = ctx;
        this.songController = songController;
        pmController = new PlayMusicController(ctx);
    }

    /**
     *
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public SongAdapter.SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_song, parent, false);

        return new SongViewHolder(view);
    }

    /**
     *
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull SongAdapter.SongViewHolder holder, int position) {
        Song currentSong = songController.getAllSongs().get(position);

        holder.txtSongTitle.setText(currentSong.getSongTitle());
        holder.txtSongAuthor.setText(currentSong.getSongAuthor());
        holder.imgSongImage.setImageResource(currentSong.getDrawableResource());


        holder.imgPlayMusic.setOnClickListener(v ->{
            pmController.playMusic(currentSong);
        });

        holder.imgPauseMusic.setOnClickListener(v -> {
            pmController.pauseMusic();
        });

        holder.imgStopMusic.setOnClickListener(v -> {
            pmController.stopMusic();
        });
    }

    /**
     *
     * @return the size of the list
     */
    @Override
    public int getItemCount() {
        return songController.getAllSongs().size();
    }

    /**
     * Binding of every View of an item
     */
    public class SongViewHolder extends RecyclerView.ViewHolder{
        ImageView imgSongImage;
        ImageView imgPlayMusic;
        ImageView imgPauseMusic;
        ImageView imgStopMusic;

        TextView txtSongTitle;
        TextView txtSongAuthor;

        SeekBar skbSongProgress;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSongImage = itemView.findViewById(R.id.imgSongImage);
            imgPlayMusic = itemView.findViewById(R.id.imgPlayMusic);
            imgPauseMusic = itemView.findViewById(R.id.imgPauseMusic);
            imgStopMusic = itemView.findViewById(R.id.imgStopMusic);

            txtSongTitle = itemView.findViewById(R.id.txtSongTitle);
            txtSongAuthor = itemView.findViewById(R.id.txtSongAuthor);

            skbSongProgress = itemView.findViewById(R.id.skbSongProgress);
        }
    }
}
