package com.example.rev_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
 ListView listView;
 ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.add("Hillary");
        adapter.add("Mercy");
        adapter.add("Koech");
        adapter.add("Barasa");
        adapter.add("Kiprono");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item= adapter.getItem(position);
        Toast.makeText(this, "You clicked" +" "+item, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);
    }
}