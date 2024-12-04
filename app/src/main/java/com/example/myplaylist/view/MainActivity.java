package com.example.myplaylist.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myplaylist.R;
import com.example.myplaylist.controller.PlayMusicController;
import com.example.myplaylist.controller.SongController;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    /**
     * Initialize necessary components to run the RecyclerView. First it loads data for the app,
     * then the RecyclerView is bound to the XML object and creates a LinearLayoutManager. Next,
     * the LinearLayoutManager and the Adapter is set to the RecyclerView.
     */
    public void initComponents(){

        // Declaration and instantiation of needed components
        RecyclerView rv = findViewById(R.id.rvSongList);    // Bind Java object to XML object
        LinearLayoutManager lm = new LinearLayoutManager(this); // Instantiation of Manager to "mount" items to RecyclerView
        SongController songController = new SongController();   // Instantiation of Controller
        SongAdapter songAdapter = new SongAdapter(this, songController);    // Instantiation of Adapter to get set to RecyclerView

        songController.loadData(); // First it's needed to load data, otherwise notify adapter

        // Set Manager and Adapter to RecyclerView after binding
        rv.setLayoutManager(lm);
        rv.setAdapter(songAdapter);
    }
}