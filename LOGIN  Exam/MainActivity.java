package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String strUserName,strPassword;
    EditText UserName,Password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = findViewById(R.id.UserName);
        Password = findViewById(R.id.Password);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strUserName = UserName.getText().toString();
                strPassword = Password.getText().toString();

                if(strUserName.equals("Anchu")&& strPassword.equals("admin123"))
                {
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));

                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
