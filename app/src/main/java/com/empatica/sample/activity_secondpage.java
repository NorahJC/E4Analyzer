package com.empatica.sample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class activity_secondpage extends AppCompatActivity {

    ImageButton bioButton;
    ImageButton recordButton ;
    ImageButton graphButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        //set activity color background
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);

        //make image buttons clickable
        bioButton = (ImageButton)findViewById(R.id.imageButton2);
        recordButton = (ImageButton)findViewById(R.id.imageButton3);
        graphButton = (ImageButton)findViewById(R.id.imageButton);

        bioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchTo = new Intent(activity_secondpage.this, MainActivity.class);
                startActivity(switchTo);
            }
        });
        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchTo = new Intent(activity_secondpage.this, activity_record.class);
                startActivity(switchTo);
            }
        });
        graphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchTo = new Intent(activity_secondpage.this, activity_graph.class);
                startActivity(switchTo);
                Toast.makeText(activity_secondpage.this, "It works", Toast.LENGTH_LONG).show();
            }
        });
    }
}
