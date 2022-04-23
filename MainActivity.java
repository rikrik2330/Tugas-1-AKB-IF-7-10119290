package com.example.rikrikherdiana_10119290;
//*sabtu 23 april, 10119290, Rikrik herdiana, IF7
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    Button tombollogout, tombolprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombollogout = findViewById(R.id.tombollogout);
        tombolprofile = findViewById(R.id.tombolprofile);

        tombollogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);

            }
        });

        tombolprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
    }
}