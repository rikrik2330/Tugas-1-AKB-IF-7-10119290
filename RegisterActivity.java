package com.example.rikrikherdiana_10119290;
//*sabtu 23 april, 10119290, Rikrik herdiana, IF7
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    private Button button;
    Button tomboldaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tomboldaftar = findViewById(R.id.tomboldaftar);

        tomboldaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);

            }
        });
    }
}