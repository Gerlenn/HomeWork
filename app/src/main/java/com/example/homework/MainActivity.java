package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}