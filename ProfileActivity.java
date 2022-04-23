package com.example.rikrikherdiana_10119290;
//*sabtu 23 april, 10119290, Rikrik herdiana, IF7
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    private Button button;
    Button tombolkembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tombolkembali = findViewById(R.id.tombolkembali);

        tombolkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}