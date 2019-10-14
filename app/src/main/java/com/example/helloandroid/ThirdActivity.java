package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ThirdActivity extends Activity implements View.OnClickListener {

    private  Chronometer Chrono;
    private boolean running;
    private long stoptime;
    @Override
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);
        setContentView(R.layout.third);

        Chrono = (Chronometer) findViewById(R.id.chro);
        Button Btnstart = (Button) findViewById(R.id.btnstart);
        Button Btnstop = (Button) findViewById(R.id.btnstop);
        Button Btnreset = (Button) findViewById(R.id.btnreset);

        Btnstart.setOnClickListener(this);
        Btnstop.setOnClickListener(this);
        Btnreset.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnstart:
                if(!running){
                    Chrono.setBase(SystemClock.elapsedRealtime()-stoptime);
                    Chrono.start();
                    running = true;
                }
                break;
            case R.id.btnstop:
                if(running) {
                    Chrono.stop();
                    stoptime = SystemClock.elapsedRealtime() - Chrono.getBase();
                    running = false;
                }
                break;
            case R.id.btnreset:
                Chrono.setBase(SystemClock.elapsedRealtime());
                stoptime = 0;
                break;
        }
    }
}

