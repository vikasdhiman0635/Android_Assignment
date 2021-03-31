package com.example.multithreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private TextView T1;
//    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress=(ProgressBar)findViewById(R.id.progressBar);
        T1=(TextView)findViewById(R.id.textView);
    }

    public void startprogress(View view)
    {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++)
                {
                    final int value=i;
                    dosomeWork();
                    progress.post(new Runnable() {
                        @Override
                        public void run() {
                            T1.setText("Updating");
                            progress.setProgress(value);
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();
    }

    private void dosomeWork()
    {
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }

    public void stopprogress(View view)
    {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                stop();
                progress.post(new Runnable() {
                    @Override
                    public void run()
                    {
                        T1.setText("Stopping");
//                        progress.setBackgroundColor(Red);
                    }
                });
            }
        };
//        new Thread(runnable).start();
    }

    public void stop()
    {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }
    }
}