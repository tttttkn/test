package com.example.test;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tai);
        Button buttonA = (Button) findViewById(R.id.button);
        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean press =true;
                TextView text1 = (TextView) findViewById(R.id.textView3);
                TextView text2 = (TextView) findViewById(R.id.textView1);
                if (press == true) {
                    text1.setText("xin chao");
                    press = false;
                }
                else
                {
                    text1.setText("Hello");
                }

                //(getApplicationContext(), "Simple Button 1", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        }

    }