package com.example.disasto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



public class helpline extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
    }
    public void showPopup(View V)
        {
            PopupMenu popup = new PopupMenu(this,V);
            popup.setOnMenuItemClickListener(this);
            popup.inflate(R.menu.popup_menu);
            popup.show();
        }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
      switch(menuItem.getItemId())
      {
          case R.id.item1:
              openRanchi();
              Toast.makeText(this,"Ranchi",Toast.LENGTH_SHORT).show();
              return true;

          case R.id.item2:
            //  openDha();
              Toast.makeText(this,"Dhanbad",Toast.LENGTH_SHORT).show();
              return true;

          case R.id.item3:
              openGiridih();
              Toast.makeText(this,"Giridih",Toast.LENGTH_SHORT).show();
              return true;

          case R.id.item4:
             // openRanchi();
              Toast.makeText(this,"Purbi Singhbhum",Toast.LENGTH_SHORT).show();
              return true;

          case R.id.item5:
              //openRanchi();
              Toast.makeText(this,"Bokaro",Toast.LENGTH_SHORT).show();
              return true;


          default:
              return false;
      }
    }

    public void openRanchi(){
        Intent intent = new Intent(this,ranchi.class);
        startActivity(intent);
    }
    public void openGiridih(){
        Intent intent = new Intent(this,Giridih.class);
        startActivity(intent);
    }
}
