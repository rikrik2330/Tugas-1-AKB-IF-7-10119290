package com.example.rikrikherdiana_10119290;
//*sabtu 23 april, 10119290, Rikrik herdiana, IF7
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button;
Button tombollogin, tombolregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tombollogin = findViewById(R.id.tombollogin);
        tombolregister = findViewById(R.id.tombolregister);

        tombollogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

        tombolregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}