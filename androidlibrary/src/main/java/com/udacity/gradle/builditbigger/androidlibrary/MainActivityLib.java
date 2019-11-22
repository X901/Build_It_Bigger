package com.udacity.gradle.builditbigger.androidlibrary;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLib extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_main);

        String jokeExtra = getIntent().getStringExtra("joke");
         TextView displayTextView = findViewById(R.id.jokeTextView);

        Log.w("app",jokeExtra);
        displayTextView.setText(jokeExtra);
    }
}
