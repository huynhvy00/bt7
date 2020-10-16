package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnnext = (Button) findViewById(R.id.btn_next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(view);
            }
        });

    }

    void open(View v) {
        Intent dsp = new Intent(this, ListActivity.class);
        startActivity(dsp);
    }
    void openList(View v) {
        Intent dsp = new Intent(this, ListActivity.class);
        startActivity(dsp);
    }

}