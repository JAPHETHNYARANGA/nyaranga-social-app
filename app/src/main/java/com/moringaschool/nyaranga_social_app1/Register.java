package com.moringaschool.nyaranga_social_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    TextView logintText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        logintText=(TextView)findViewById(R.id.textView2);

        loginButton = (Button)findViewById(R.id.btnRegister);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this, "Login to continue", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        });

        logintText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}