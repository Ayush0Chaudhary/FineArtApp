package com.example.finart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button1, button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity2();
            }
        });

        button2 = findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            activity3();
        }
    });

        button3= findViewById(R.id.button3);
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               activity4();
           }
       });

       button4=findViewById(R.id.button4);
       button4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               activity5();
           }
       });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity6();
            }
        });

    }
    public void activity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void activity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void activity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void activity5() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
        }

    public void activity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}