package com.example.parkminhyun.trackengine;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class VirtualRealityActivity extends AppCompatActivity {

    private List<Subject> subjects;
    private RecyclerView rvSubject;
    RVAdapterVirtualReality adapter;

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
        setContentView(R.layout.activity_virtual_reality);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        rvSubject = (RecyclerView) findViewById(R.id.rv_subject);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvSubject.setLayoutManager(llm);
        rvSubject.setHasFixedSize(true);

        subjects = new ArrayList<>();
//        initializeSubjects();

        subjects.add(new Subject("[2-1]", "멀티미디어 프로그래밍"));
        subjects.add(new Subject("[2-1]", "멀티미디어"));
        subjects.add(new Subject("[3-1]", "컴퓨터 그래픽스"));
        subjects.add(new Subject("[3-1]", "게임 프로그래밍"));
        subjects.add(new Subject("[3-2]", "고급 실시간 그래픽스"));
        subjects.add(new Subject("[3-2]", "디지털 사운드"));
        subjects.add(new Subject("[4-1]", "가상현실"));
        subjects.add(new Subject("[4-1]", "컴퓨터 애니메이션"));
        subjects.add(new Subject("[4-2]", "증강현실"));
        subjects.add(new Subject("[4-2]", "HCI개론"));

        adapter = new RVAdapterVirtualReality(this, subjects);
        rvSubject.setAdapter(adapter);


    }


    public void makeTransParentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    public void initializeSubjects(){

    }
}
