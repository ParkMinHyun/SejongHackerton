package com.example.parkminhyun.trackengine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Item> items;
    private RecyclerView rv;
    RVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        items = new ArrayList<>();

        items.add(new Item("박민현"));
        items.add(new Item("안태현"));
        items.add(new Item("오성민"));
        items.add(new Item("이명호"));

        adapter = new RVAdapter(items);
        rv.setAdapter(adapter);
    }
}
