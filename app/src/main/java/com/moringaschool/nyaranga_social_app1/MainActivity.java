package com.moringaschool.nyaranga_social_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tvRegister) TextView registerText;
    @BindView(R.id.button1) Button newActivity;
    @BindView(R.id.etUserName) EditText username;
    @BindView(R.id.etPassword) EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);





        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String showName = username.getText().toString();

                if(showName.isEmpty()){
                    Toast.makeText(MainActivity.this,"input username to continue",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "welcome "+ showName, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("EXTRA_NAME", showName);
                    startActivity(intent);

                }


            }
        });


    }
}