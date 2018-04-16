package com.example.a14049472.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the button and set the OnClickListener
        Button btnDone =(Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the EditText that user keys in the name
                EditText etName=(EditText)findViewById(R.id.editTextName);
                //get the EditText that user key in age
                EditText etAge=(EditText)findViewById(R.id.editTextAge);
                //put the name and age into an array
                String[]info={etName.getText().toString(),etAge.getText().toString()};
                // create an intent to start another activity called
                // DemoActivities (which we would create later)
                Intent intent=new Intent(MainActivity.this,DemoActivities2.class);
                // Pass the String array holding the name & age to new activity
                intent.putExtra("info",info);
                // start the new activity
                startActivity(intent);

            }
        });
    }
}
