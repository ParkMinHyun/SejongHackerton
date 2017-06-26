package com.example.parkminhyun.trackengine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AccreditInfoPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public AccreditInfoPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AccreditInfoTab1_Intro tab1 = new AccreditInfoTab1_Intro();
                return tab1;
            case 1:
                AccreditInfoTab2_Hours tab2 = new AccreditInfoTab2_Hours();
                return tab2;
            case 2:
                AccreditInfoTab3_Admissions tab3 = new AccreditInfoTab3_Admissions();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}