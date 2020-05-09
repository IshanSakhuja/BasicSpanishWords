package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ishan(View view)
    {
        int temp = view.getId();
        switch(temp)
        {
            case R.id.button : {
                mediaPlayer = MediaPlayer.create(this,R.raw.morning);
                mediaPlayer.start();
                break;
            }
            case R.id.button1 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.afternoon);
                mediaPlayer.start();
                break;
            }
            case R.id.button2 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.night);
                mediaPlayer.start();
                break;
            }
            case R.id.button3 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.bye);
                mediaPlayer.start();
                break;
            }
            case R.id.button4 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.please);
                mediaPlayer.start();
                break;
            }
            case R.id.button5 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.seeyou);
                mediaPlayer.start();
                break;
            }
            case R.id.button6 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.seeyoulater);
                mediaPlayer.start();
                break;
            }
            case R.id.button7 : {
                mediaPlayer = MediaPlayer.create(this,R.raw.holachao);
                mediaPlayer.start();
                break;
            }
        }
    }
}
