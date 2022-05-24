package com.example.rev_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btn=findViewById(R.id.button);
        text=findViewById(R.id.textView);
        btn.setOnClickListener(this);
        text.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ActivityTwo.this,MainActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ActivityTwo.this,MainActivity.class);
//                startActivity(intent);
//
//            }
//        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this, "You clicked the button", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.textView:
                Toast.makeText(this, "You clicked the text", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}