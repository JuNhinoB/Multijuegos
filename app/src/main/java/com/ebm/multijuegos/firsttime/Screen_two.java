package com.ebm.multijuegos.firsttime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ebm.multijuegos.R;

public class Screen_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twoo);

        ImageView next = (ImageView) findViewById(R.id.btnscreentwo);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen_two.this,Screen_three.class);
                startActivity(i);
            }
        });
    }
}