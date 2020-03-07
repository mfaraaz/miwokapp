package com.example.miwoklang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers =(TextView)findViewById(R.id.numbers);
        TextView family=(TextView)findViewById(R.id.family);
        TextView phrases =(TextView)findViewById(R.id.phrases);
        TextView colors=(TextView)findViewById(R.id.colors);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartNumbers = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(StartNumbers);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartFamily = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(StartFamily);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartPhrases =new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(StartPhrases);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartColors=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(StartColors);
            }
        });


    }



}
