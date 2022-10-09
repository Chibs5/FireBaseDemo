package com.example.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        register.setOnClickListener(v -> {
            startActivity(new Intent(StartActivity.this, RegisterActivity.class));
            finish();
        });

        login.setOnClickListener(v -> {
            startActivity(new Intent(StartActivity.this, LoginActivity.class));
            finish();
        });
    }
}