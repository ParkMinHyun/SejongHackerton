package com.example.parkminhyun.trackengine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class AccreditInfoTab3_Admissions extends Fragment {

    public String spotName;
    private LinearLayout inflatedLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        inflatedLayout = (LinearLayout) inflater.inflate(R.layout.tab_accredit, container, false);
        setContentWork();
        return inflatedLayout;
    }


    public void setContentWork() {

    }

}