package com.example.android.jusjava;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.LinearLayout;
import java.util.*;
public class  MainActivity extends AppCompatActivity {
    LinearLayout l1;
    int r=0,g=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (LinearLayout)findViewById(R.id.l1);

        Button b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                r+=50;
                if (r>250){
                    r=0;
                }
                TextView txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText(String.valueOf(r));
                l1.setBackgroundColor(Color.rgb(r,g,b));

            }
        });
        Button b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView txt2 = (TextView) findViewById(R.id.txt2);
                g+=50;
                if (g>250){
                    g=0;
                }
                txt2.setText(String.valueOf(g));
                l1.setBackgroundColor(Color.rgb(r,g,b));

            }
        });
        Button b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt3 = (TextView) findViewById(R.id.txt3);
                b += 50;
                if (b>250){
                    b=0;
                }
                txt3.setText(String.valueOf(b));
                l1.setBackgroundColor(Color.rgb(r, g, b));

            }
        });
    }

}
