package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ProducerActivies extends AppCompatActivity {

    private static final String TAG = ProducerActivies.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer_activies);

        Button btn1=(Button)findViewById(R.id.btnBack);
        btn1.setOnClickListener(this::OnBack);

        Intent intentResponsible=getIntent();
        Bundle bundle=intentResponsible.getExtras();
        if(bundle!=null){
            String one=bundle.getString("KeyOne");
            String Two=bundle.getString("KeyTwo");
            Log.i(TAG,"one="+one+"Two="+Two);
            ((RadioButton)findViewById(R.id.redone)).setText(Two);
            ((RadioButton)findViewById(R.id.redtwo)).setText(one);
        }
    }
    //create method back button
    private void OnBack(View view) {
         Intent intent=new Intent();
         Bundle bundle=new Bundle();

         bundle.putString("KeyResult",getSelectedTest());


        finish();
    }

    private String getSelectedTest() {
      int id=  ((RadioGroup)findViewById(R.id.rdoGrp)).getCheckedRadioButtonId();
        return ((RadioButton)findViewById(id)).getText().toString();
    }
}