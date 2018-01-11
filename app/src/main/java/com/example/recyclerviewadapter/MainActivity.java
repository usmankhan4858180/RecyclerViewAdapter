package com.example.recyclerviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    String[] country = {"Pakistan", "India", "England", "USA", "China", "France", "Germany"};
    String[] capitals = {"Islamabad", "Delhi", "London", "NewYork", "Beijing", "Paris", "Berlin"};
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        MyAdapter adapter = new MyAdapter(MainActivity.this,capitals,country);
        layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}