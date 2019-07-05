package com.example.disasto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutorials extends AppCompatActivity {
      private Button earthquake;
    private Button flood;
    private Button lightning;
    private Button fire;
    private Button mining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        earthquake = (Button)findViewById(R.id.button2);
        earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEarthquake();
            }
        });
        flood = (Button)findViewById(R.id.button3);
        flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlood();
            }
        });
        lightning = (Button)findViewById(R.id.button4);
        lightning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLightning();
            }
        });
        mining = (Button)findViewById(R.id.button6);
        mining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMining();
            }
        });
        fire = (Button)findViewById(R.id.button5);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFire();
            }
        });
    }
    public void openEarthquake() {
        Intent intent = new Intent(this,earthquake.class);
        startActivity(intent);
    }
    public void openFlood() {
        Intent intent = new Intent(this,flood.class);
        startActivity(intent);
    }
    public void openLightning() {
        Intent intent = new Intent(this,lightning.class);
        startActivity(intent);
    } public void openFire() {
        Intent intent = new Intent(this,fire.class);
        startActivity(intent);
    }
    public void openMining() {
        Intent intent = new Intent(this,mining.class);
        startActivity(intent);
    }

}
