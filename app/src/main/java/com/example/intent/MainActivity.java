package com.example.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnlogin, btnsignup;
  
    private EditText username,password;
    String kt_username= "Vy";
    String kt_password= "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = (Button) findViewById(R.id.buttonlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
                } else if(username.getText().toString().equals(kt_username)){
                    if(password.getText().toString().equals(kt_password)){
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công",Toast.LENGTH_LONG).show();
                        open(view);
                    }else{
                        Toast.makeText(MainActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
                }
            }
        });
        username=(EditText) findViewById(R.id.user);
        password=(EditText) findViewById(R.id.pass);

        btnsignup = (Button) findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp(view);
            }
        });
    }
    void open(View v) {
        Intent dsp = new Intent(this, ProfileActivity.class);
        startActivity(dsp);
    }

    void openSignUp(View v) {
        Intent dsp = new Intent(this, SignupActivity.class);
        startActivity(dsp);
    }


}