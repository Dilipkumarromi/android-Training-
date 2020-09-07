package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProducerActivies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer_activies);

        Button btn1=(Button)findViewById(R.id.btnBack);
        btn1.setOnClickListener(this::OnBack);
    }
    //create method back button
    private void OnBack(View view) {
        Class cls2=MainActivity.class;
        Intent intent=new Intent(this,cls2);
        startActivity(intent);
    }
}