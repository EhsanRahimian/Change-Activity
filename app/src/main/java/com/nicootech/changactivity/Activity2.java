package com.nicootech.changactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //for intentService
        //Intent intent1 = new Intent(this, MyIntentService.class );
       // startService(intent1);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }
}
