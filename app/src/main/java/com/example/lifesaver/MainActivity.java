package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = (EditText) findViewById(R.id.email);
        EditText pass = (EditText) findViewById(R.id.pass);
        TextView create = (TextView) findViewById(R.id.create);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signup();
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void Signup(){
        Intent opensignup = new Intent(this, Signup.class);
        startActivity(opensignup);
    }
}