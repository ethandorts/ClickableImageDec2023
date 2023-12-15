package com.example.clickableimagedec2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DisplayText(View view) {
        Toast.makeText(this, "Image is clicked", Toast.LENGTH_LONG).show();
    }
}