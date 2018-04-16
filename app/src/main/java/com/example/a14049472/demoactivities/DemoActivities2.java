package com.example.a14049472.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        // get the intent so sas to get the "things" inside the intent
        Intent i=getIntent();
        // get the String array named "info" we passed in
        String[] info=i.getStringArrayExtra("info");
        //get the TextView object
        TextView tv1=(TextView)findViewById(R.id.textView1);
        // display the name and age to the textView
        tv1.setText("You are "+info[0]+",age"+info[1]);
    }
}
