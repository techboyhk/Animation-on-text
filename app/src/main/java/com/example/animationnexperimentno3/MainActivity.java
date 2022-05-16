package com.example.animationnexperimentno3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Translate(View view)
    {
        TextView txt=(TextView) findViewById(R.id.animetxt);
        txt.animate().translationXBy(60).setDuration(1300);
    }
    public void rotate(View view)
    {
        TextView txt=(TextView) findViewById(R.id.animetxt);
        txt.animate().rotationYBy(40).setDuration(1300);
    }
    public void Scale(View view)
    {
        TextView txt=(TextView) findViewById(R.id.animetxt);
        txt.animate().scaleX(2).setDuration(2000);
    }
    public void Dissap(View view)
    {
        TextView txt=(TextView) findViewById(R.id.animetxt);
        txt.animate().alpha(0).setDuration(2000);

    }

}