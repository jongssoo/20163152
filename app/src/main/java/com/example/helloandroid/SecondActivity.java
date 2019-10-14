package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends Activity {
    EditText eid;
    EditText epw;
    EditText ename;
    EditText ephone;
    EditText eemail;
    boolean checking;
    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> pw = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> phone = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedIntanceState){


        super.onCreate(savedIntanceState);
        setContentView(R.layout.second);

        eid = (EditText) findViewById(R.id.editid);
        epw = (EditText) findViewById(R.id.editpw);
        ename = (EditText) findViewById(R.id.editname);
        ephone = (EditText) findViewById(R.id.editnum);
        eemail = (EditText) findViewById(R.id.editemail);
        Button btncheck = (Button) findViewById(R.id.btncheck);


        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getid = eid.getText().toString();
                if(id.contains(getid)){
                    checking = false;
                    Toast.makeText(getApplicationContext(), "이미 존재하는 아이디입니다.",Toast.LENGTH_LONG).show();
                }
                else {
                    checking = true;
                    Toast.makeText(getApplicationContext(), "사용 가능한 아이디입니다.",Toast.LENGTH_LONG).show();
                }
            }
        });

        Button btnjoin = (Button) findViewById(R.id.btnjoin);

        btnjoin.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v) {
                String getid = eid.getText().toString();
                String getpw = epw.getText().toString();
                String getphone = ephone.getText().toString();
                String getname = ename.getText().toString();
                String getemail = eemail.getText().toString();
                id.add(getid);
                pw.add(getpw);
                phone.add(getphone);
                name.add(getname);
                email.add(getemail);
                if(id.get(0) != "" & pw.get(0) != "" & phone != null & name != null & email !=null & checking == true) {
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(), "정보를 다 입력해 주세요.",Toast.LENGTH_LONG).show();
                }
            }
        });

        Button btnback = (Button) findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v) {
                finish();
            }
        });
    }
}
