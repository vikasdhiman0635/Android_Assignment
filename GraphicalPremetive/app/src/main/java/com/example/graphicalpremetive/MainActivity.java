package com.example.graphicalpremetive;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity 
{

    Bitmap bg;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
        img=(ImageView) findViewById(R.id.imageview);
        img.setImageBitmap(bg);
        Canvas canvas= new Canvas(bg);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);

        canvas.drawText("Rectangular",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);

        canvas.drawText("Circle",120,50,paint);
        canvas.drawCircle(200,300,150,paint);

        canvas.drawText("Square",120,800,paint);
        canvas.drawRect(50,850,350,1150,paint);

        canvas.drawText("Line",480,800,paint);
        canvas.drawLine(520,850,520,1150,paint);
    }

}