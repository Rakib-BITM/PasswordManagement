package com.rakib.passwordmanager.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rakib.passwordmanager.R;

public class MainActivity extends AppCompatActivity {

    TextView regTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void userLogin(View view) {

    }


    public void userRegistration(View view) {
        startActivity(new Intent(this,Registration.class));
        finish();
    }
}