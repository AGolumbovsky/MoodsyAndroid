package com.andriy.moodsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void animateHappy (View view){

        ImageView happy = (ImageView) findViewById(R.id.happy);
        happy.animate().rotation(1800f).setDuration(2000); // for some reason does it only once

    }

    public void animateMad (View view) {

        ImageView mad = (ImageView) findViewById(R.id.mad);
        mad.animate().translationXBy(50f).setDuration(2000);
       // mad.animate().translationXBy(-50f).setDuration(5000);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
