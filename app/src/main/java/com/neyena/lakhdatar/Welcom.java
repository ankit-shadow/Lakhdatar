package com.neyena.lakhdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        Button parichayBtn=findViewById(R.id.rashifal);
        Button shopBtn= findViewById(R.id.contin);
        Button timeTable= findViewById(R.id.tt);


        parichayBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent parichayBtn = new Intent(Welcom.this, About.class);
                startActivity(parichayBtn);
            }
        });

        shopBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent shopBtn = new Intent(Welcom.this, Home.class);
                startActivity(shopBtn);
            }
        });
        timeTable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent timeTable = new Intent(Welcom.this, TimeTable.class);
                startActivity(timeTable);
            }
        });

    }
}
