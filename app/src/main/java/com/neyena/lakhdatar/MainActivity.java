package com.neyena.lakhdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    MediaPlayer intromusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intromusic = MediaPlayer.create(this, R.raw.intro_om);
        intromusic.start();


        SystemClock.sleep(2000);
        Intent Welcome = new Intent(MainActivity.this, Welcom.class);
        startActivity(Welcome);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        intromusic.release();
        finish();
    }
}
