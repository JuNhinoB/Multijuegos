package com.ebm.multijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    ProgressBar pb;
    int counter = 0;

    //Después de completar 10000 ms, comenzará la siguiente actividad
    private static int SPLASH_SCREEN_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Este método se utiliza para que su actividad de bienvenida
        // puede cubrir toda la pantalla.

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //La intención se usa para cambiar de una actividad a otra.
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                //llama la segunda actividad
                startActivity(i);
                //la actvidad sera cerrada
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);


        //progress bar
        prog();

    }

    public void prog(){
        pb = (ProgressBar) findViewById(R.id.pb);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pb.setProgress(counter);

                if (counter == 100)
                    t.cancel();
            }
        };
        t.schedule(tt,0,50);
    }
}