package com.moringaschool.nyaranga_social_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.gridy) GridView gridView;
    @BindView(R.id.textView3) TextView viewText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
        gridView.setAdapter(new Adaptery(this));
        gridView.setNumColumns(2);

        Intent intent = getIntent();
        String NAME_EXTRA = intent.getStringExtra("NAME_EXTRA");
        viewText.setText(NAME_EXTRA);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(HomeActivity.this,"you clicked item number:"+ position, Toast.LENGTH_LONG).show();
            }
        });
    }
}