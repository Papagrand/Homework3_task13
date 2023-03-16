package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToPos(View view){
        Intent intent = new Intent(this, PosActivity.class);
        startActivity(intent);
    }
    public void goToSdvig(View view){
        Intent intent = new Intent(this, SdvigActivity.class);
        startActivity(intent);
    }
    public void goToHorizChain(View view){
        Intent intent = new Intent(this, HorizChainActivity.class);
        startActivity(intent);
    }
    public void goToVertChain(View view){
        Intent intent = new Intent(this, VertChainActivity.class);
        startActivity(intent);
    }
    public void goToProgCreating(View view){
        Intent intent = new Intent(this, ProgCreating.class);
        startActivity(intent);
    }
}