package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnandroid=(Button)findViewById(R.id.BtnMango);
        btnandroid.setOnClickListener(this::OnMango);

        findViewById(R.id.btnApple).setOnClickListener(this::OnApple);

    }

    private void OnApple(View view) {
        Class cls1=ProducerActivies.class;
        Intent intent=new Intent(this,cls1);
        Bundle bundle=new Bundle();
        bundle.putString("KeyOne","Mango1");
        bundle.putString("KeyTwo","Mango2");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void OnMango(View view){
        Class cls1=ProducerActivies.class;
        Intent intent=new Intent(this,cls1);
        Bundle bundle=new Bundle();
        bundle.putString("KeyOne","Apple1");
        bundle.putString("KeyTwo","Apple2");
        intent.putExtras(bundle);
        startActivity(intent);
    }
}