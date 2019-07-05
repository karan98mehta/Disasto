package com.example.disasto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class mining extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mining);
        clk = (Button) findViewById(R.id.button10);
        videov = (VideoView) findViewById(R.id.videoView4);
        mediaC = new MediaController(this);
    }

    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.disasto/raw/mines/";
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
