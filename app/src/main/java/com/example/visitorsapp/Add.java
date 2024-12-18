package com.example.visitorsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {
    Button b1;
    String s1,s2,s3,s4;
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        e1=(EditText) findViewById(R.id.fname);
        e2=(EditText) findViewById(R.id.laname);
        e3=(EditText) findViewById(R.id.purpose);
        e4=(EditText) findViewById(R.id.meet);
        b1=(Button) findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                Toast.makeText(getApplicationContext(),s1+s2+s3+s4, Toast.LENGTH_SHORT).show();
            }
        });
    }
}