package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Called from any button press
    public void playAudio (View view)   {
        // Converts the view into a button
        Button button = (Button)view;
        // Since each button has a tag of the audio, this will create a media player from the button's tag
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        // Plays the audio
        mediaPlayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
