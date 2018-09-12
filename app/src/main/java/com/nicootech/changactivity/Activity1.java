package com.nicootech.changactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Activity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        //for service
        Intent i = new Intent(this,MyService.class);
        startService(i);



        //for intentService

       // Intent intent = new Intent(this, MyIntentService.class );
       // startService(intent);

        Button act1Button = findViewById(R.id.act1Button);

        act1Button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent myIntent = new Intent(getApplicationContext(),Activity2.class);
                        startActivity(myIntent);
                    }
                }


        );

    }
}
