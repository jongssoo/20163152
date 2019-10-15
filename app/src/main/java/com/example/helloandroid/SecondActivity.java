package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends Activity {
    EditText eid;
    EditText epw;
    EditText ename;
    EditText ephone;
    EditText eemail;
    boolean checking;
    public static ArrayList<String> id = new ArrayList<>();
    public static ArrayList<String> pw = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<String> phone = new ArrayList<>();
    public static ArrayList<String> email = new ArrayList<>();
    RadioButton radio;


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
        radio = (RadioButton) findViewById(R.id.radio);
        checking = false;


        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getid = eid.getText().toString().trim();
                if(id.contains(getid)){
                    checking = false;
                    Toast.makeText(getApplicationContext(), "이미 존재하는 아이디입니다.",Toast.LENGTH_LONG).show();
                }
                else if(getid.matches("")){
                    checking = false;
                    Toast.makeText(getApplicationContext(), "아이디를 입력해주세요.",Toast.LENGTH_LONG).show();

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
                String getid = eid.getText().toString().trim();
                String getpw = epw.getText().toString().trim();
                String getphone = ephone.getText().toString().trim();
                String getname = ename.getText().toString().trim();
                String getemail = eemail.getText().toString().trim();
                System.out.println(getpw);
                if(getid.matches("") !=true & getpw.matches("") != true & getphone.matches("") !=true & getemail.matches("") !=true & checking == true & radio.isChecked()){
                id.add(getid);
                pw.add(getpw);
                phone.add(getphone);
                name.add(getname);
                email.add(getemail);
                    finish();
                }
                else {
                    if(radio.isChecked() ==false){
                        Toast.makeText(getApplicationContext(), "약관을 동의해 주세요.",Toast.LENGTH_LONG).show();
                    }
                    else if(checking == false){
                        Toast.makeText(getApplicationContext(), "아이디 중복확인을 해주세요.",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "정보를 다 입력해 주세요.", Toast.LENGTH_LONG).show();
                    }
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
