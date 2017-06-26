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
                AccreditInfoTab1_LiberalArts tab0=new AccreditInfoTab1_LiberalArts();
                return tab0;
            case 1:
                AccreditInfoTab2_BSM tab1 = new AccreditInfoTab2_BSM();
                return tab1;
            case 2:
                AccreditInfoTab3_Major tab2 = new AccreditInfoTab3_Major();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}