package com.ebm.multijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Action extends AppCompatActivity {

    RelativeLayout a1,a2,a3,a4,a5,a6;
    String a1loader,a2loader,a3loader,a4loader,a5loader,a6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);


        //Juegos Accion
        //juego 1
        a1loader = "https://games.cdn.famobi.com/html5games/j/jetpack-joyride/v030/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=6136c21a-b83b-48de-9f8f-0974444ee1d1&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=750&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a1 = (RelativeLayout) findViewById(R.id.a_item1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a1loader);
                startActivity(intent);
            }
        });

        //juego 2
        a2loader = "https://games.cdn.famobi.com/html5games/z/zombies-eat-my-stocking/v5/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=10158f0e-0fd1-4f73-b38c-108a3f684146&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=779&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a2 = (RelativeLayout) findViewById(R.id.a_item2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a2loader);
                startActivity(intent);
            }
        });

        a3loader = "https://games.cdn.famobi.com/html5games/a/angry-flappy-wings/v070/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=7e2fd492-a4a1-4cba-9e72-f503591e3b5c&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=774&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a3 = (RelativeLayout) findViewById(R.id.a_item3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a3loader);
                startActivity(intent);
            }
        });

        a4loader = "https://games.cdn.famobi.com/html5games/k/knife-rain/v820/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=acf1dae7-f647-4107-b381-8817a18a6e4d&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=780&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a4 = (RelativeLayout) findViewById(R.id.a_item4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a4loader);
                startActivity(intent);
            }
        });

        a5loader = "https://games.cdn.famobi.com/html5games/c/crowd-run-3d/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=28ab613b-9f40-4ab7-8f09-aa19f32e3660&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=779&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a5 = (RelativeLayout) findViewById(R.id.a_item5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a5loader);
                startActivity(intent);
            }
        });

        a6loader = "https://games.cdn.famobi.com/html5games/b/boat-battles/v070/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=79fb2d91-3c76-4850-aa23-c03b1c94a27a&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=784&original_ref=https%3A%2F%2Fgames.famobi.com%2F";
        a6 = (RelativeLayout) findViewById(R.id.a_item6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", a6loader);
                startActivity(intent);
            }
        });


    }
}