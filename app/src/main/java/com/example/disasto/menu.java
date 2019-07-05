package com.example.disasto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class menu extends AppCompatActivity {


    GoogleSignInClient mGoogleSignInClient;
    TextView name;
    TextView email;
    Button sign_out;
    Button youtubetutorial;
    Button location;
    Button sos;
    Button helpline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        sign_out = findViewById(R.id.sign_out_button);
        name = findViewById(R.id.textView);
        email = findViewById(R.id.textView2);
        youtubetutorial = findViewById(R.id.yt_button);
        location = findViewById(R.id.lo_button);
        helpline = findViewById(R.id.helpline_button);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();


        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(menu.this);
        if(acct!= null){
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();

            name.setText(String.format("Name: %s", personName));
            email.setText(String.format("Email: %s", personEmail));
        }
        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });
        youtubetutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, tutorials.class));
            }

        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,helpline.class));
            }
        });


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passingdata = name.getText().toString();
                Intent i = new Intent(menu.this, MapsActivity.class);
                Bundle b = new Bundle();
                b.putString("Key", passingdata);
                i.putExtras(b);
                startActivity(i);
                //Intent intent = new Intent(Main2Activity.this, MapsActivity.class);
                //intent.putExtra("value2","world");
                //startActivity(intent);
                //startActivity(new Intent(Main2Activity.this, MapsActivity.class));
            }
        });

    }
    private void signOut ()
    {
        mGoogleSignInClient.signOut();
        startActivity(new Intent(menu.this, MainActivity.class));
    }
}
