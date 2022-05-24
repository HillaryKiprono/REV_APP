package com.example.rev_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button btn,calling,showloaction;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btn=findViewById(R.id.button);
        text=findViewById(R.id.textView);

        calling=findViewById(R.id.dial);
        calling.setOnClickListener(this);
        showloaction=findViewById(R.id.location);

        showloaction.setOnClickListener(this);
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

            case  R.id.dial:
                 Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0714413391"));
                 startActivity(intent);
                break;

            case  R.id.location:
                Intent intentlocation= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-0.5973225,35.323711,17z=5"));
                startActivity(intentlocation);
                break;
        }
    }
}