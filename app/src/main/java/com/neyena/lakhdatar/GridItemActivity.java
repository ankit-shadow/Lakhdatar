package com.neyena.lakhdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
public class GridItemActivity extends AppCompatActivity {

    TextView gridData;
    TextView lyrics;
    ImageView imageView;
    MediaPlayer aarti;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        gridData = findViewById(R.id.god_names);
        imageView = findViewById(R.id.god_image);
        lyrics = findViewById(R.id.god_lyrics);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        int receivedAudio = intent.getIntExtra("audio",0);
        String receivedLyrics =  intent.getStringExtra("lyrics");

        gridData.setText(receivedName);
        imageView.setImageResource(receivedImage);
        lyrics.setText(receivedLyrics);
        aarti = MediaPlayer.create(this,receivedAudio);
        aarti.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        aarti.release();
        finish();
    }
}