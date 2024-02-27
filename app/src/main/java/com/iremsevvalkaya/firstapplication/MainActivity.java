package com.iremsevvalkaya.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void changeImage(View view) {
         ImageView dkttImage = findViewById(R.id.imageView);
         dkttImage.setImageResource(R.drawable.dktt2);
     }


}