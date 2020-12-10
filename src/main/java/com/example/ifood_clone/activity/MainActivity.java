package com.example.ifood_clone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.ifood_clone.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //esconde a Action Bar

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abriAuth();
            }
        },  3000);

        }
    private void abriAuth(){
        Intent i = new Intent(MainActivity.this, authActivity.class);
        startActivity(i);
        finish();
    }
}
