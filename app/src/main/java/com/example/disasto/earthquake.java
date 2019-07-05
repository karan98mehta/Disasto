package com.example.disasto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import static com.example.disasto.R.id.videoView;

public class earthquake extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        clk = (Button) findViewById(R.id.button7);
        videov = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);

    }

    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.disasto/raw/earth/";
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
