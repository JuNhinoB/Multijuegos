package com.ebm.multijuegos.firsttime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ebm.multijuegos.MainActivity;
import com.ebm.multijuegos.R;

public class Screen_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_threee);


        ImageView next = (ImageView) findViewById(R.id.btnscreenthree);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen_three.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}