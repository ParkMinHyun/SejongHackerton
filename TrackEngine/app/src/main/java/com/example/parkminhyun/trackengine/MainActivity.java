package com.example.parkminhyun.trackengine;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Item> items;
    private RecyclerView rv;
    RVAdapter adapter;
    Button registerStudyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        makeTransParentStatusBar();
        super.onCreate(savedInstanceState);
        try {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.custom_bar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        items = new ArrayList<>();

        items.add(new Item("가상현실 트랙"));
        items.add(new Item("인공지능 트랙"));
        items.add(new Item("응용SW 트랙"));
        items.add(new Item("HCI&VC 트랙"));
        items.add(new Item("멀티미디어 트랙"));
        items.add(new Item("사물인터넷 트랙"));
        items.add(new Item("시스템응용 트랙"));
        items.add(new Item("지능형인지 트랙"));
        items.add(new Item("데이터 사이언스 트랙"));
        items.add(new Item("정보보호 트랙"));


        adapter = new RVAdapter(items);
        rv.setAdapter(adapter);
        registerStudyBtn = (Button)findViewById(R.id.registerStudyBtn);
        registerStudyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerStudy = new Intent(MainActivity.this, RegisterStudyActivity.class);
                startActivity(registerStudy);
            }
        });

    }

    public void makeTransParentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}
