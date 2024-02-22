package com.example.fullscreendialogdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button show = findViewById(R.id.button);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FullScreenDialog dialog = new FullScreenDialog();
                dialog.show(getSupportFragmentManager(), "dialog");

                /*getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .add(android.R.id.content, new FullScreenDialog())
                        .addToBackStack(null).commit();*/
            }
        });
    }
}