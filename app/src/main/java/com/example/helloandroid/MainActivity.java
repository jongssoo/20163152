package com.example.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editid;
    EditText editpw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editid = (EditText) findViewById(R.id.editlid);
        editpw = (EditText) findViewById(R.id.editlpw);



        Button btngo,btnsign;


        btngo = (Button) findViewById(R.id.btngo);
        btnsign = (Button) findViewById(R.id.btnsign);




        btngo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String putid = editid.getText().toString();
                String putpw = editpw.getText().toString();
                if(SecondActivity.id.contains(putid) & SecondActivity.pw.contains(putpw)) {
                    Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "아이디 및 비빌번호가 맞지 않습니다.",Toast.LENGTH_LONG).show();
                }
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
