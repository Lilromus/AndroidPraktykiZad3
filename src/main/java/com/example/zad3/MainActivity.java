package com.example.zad3;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View square = findViewById(R.id.square);

        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_square);


        square.startAnimation(rotateAnimation);
    }
}
