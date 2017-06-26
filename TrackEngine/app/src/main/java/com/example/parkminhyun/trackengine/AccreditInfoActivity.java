package com.example.parkminhyun.trackengine;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class AccreditInfoActivity extends AppCompatActivity {

    public static Activity getActivity;
    private TextView activityNameTxt;
    public static String spotName;
    public static Context mContextTourInfo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        makeTransParentStatusBar();
        super.onCreate(savedInstanceState);
        try {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.custom_bar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setContentView(R.layout.activity_accredit);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        new AlertDialog.Builder(this).setTitle("주의!")
                .setMessage("공학설계인증은 '공학설계기초' ~ '캡스톤디자인프로젝트' 사이에 이수한 과목만 인정됩니다. 자세한 설명은 공학인증 홈페이지를 참조하세요.")
                .setNeutralButton("닫기",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dig,int sumthin){
                    }
                }).show();

        //탭 레이아웃
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab((tabLayout.newTab().setText("전문교양")));
        tabLayout.addTab(tabLayout.newTab().setText("BSM"));
        tabLayout.addTab(tabLayout.newTab().setText("전공"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final AccreditInfoPagerAdapter adapter = new AccreditInfoPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

//    public void setTourInfoView(String spotName){
//        activityNameTxt = (TextView) findViewById(R.id.activityName);
//        activityNameTxt.setText(spotName);
//    }

    public void btn_Back_Click(View v) {
        setResult(0);
        finish();
    }

    @Override
    public void onBackPressed(){
        setResult(0);
        finish();
    }
    public void makeTransParentStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}