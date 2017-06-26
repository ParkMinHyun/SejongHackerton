package com.example.parkminhyun.trackengine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class AccreditInfoActivity extends AppCompatActivity {

    public static Activity getActivity;
    private TextView activityNameTxt;
    public static String spotName;
    public static Context mContextTourInfo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accredit);
        mContextTourInfo = this;
        getActivity = this;
        // 현재 활성화된 액티비티를 시작하게 한 인텐트 호출
        Intent intent = getIntent();
        spotName=intent.getStringExtra("관광명소");
        Log.d("test", "temp"+spotName);

        //탭 레이아웃
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("전문교양"));
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
}