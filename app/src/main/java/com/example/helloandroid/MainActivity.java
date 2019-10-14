package com.example.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editid = (EditText) findViewById(R.id.editlid);



        Button btngo,btnsign;


        btngo = (Button) findViewById(R.id.btngo);
        btnsign = (Button) findViewById(R.id.btnsign);




        btngo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String putid = editid.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                }

        });


        btnsign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);

            }
        });

    }
}
