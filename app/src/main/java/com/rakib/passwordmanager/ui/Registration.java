package com.rakib.passwordmanager.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rakib.passwordmanager.R;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
    }

    public void userLogin(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}