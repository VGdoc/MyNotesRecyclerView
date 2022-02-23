package com.example.mynotesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mynotesrecyclerview.UI.FragmentNotes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, FragmentNotes.newInstance()).commit();
        }
    }
}