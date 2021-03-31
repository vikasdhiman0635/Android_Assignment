package com.example.changefontandcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int ch=1;
    float afont=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incfont();
        desfont();
        changefont();
    }

    public void incfont()
    {
        final TextView t=(TextView)findViewById(R.id.textView);
        Button incfont=(Button) findViewById(R.id.button);
        incfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(afont);
                afont=afont+5;
                if(afont==50)
                {
                    afont=30;
                }
            }
        });
    }
    public void desfont()
    {
        final TextView t=(TextView)findViewById(R.id.textView);
        Button decfont=(Button) findViewById(R.id.button2);
        decfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(afont);
                afont=afont-5;
                if(afont==20)
                {
                    afont=30;
                }
            }
        });
    }

    public void changefont()
    {
        final TextView t=(TextView)findViewById(R.id.textView);
        Button changecolor=(Button)findViewById(R.id.button3);
        changecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch)
                {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case  3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.GRAY);
                        break;
                    case 5:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 6:
                        t.setTextColor(Color.BLACK);
                        break;
                }
                ch++;
                if(ch==7)
                    ch=1;
            }
        });
    }
}