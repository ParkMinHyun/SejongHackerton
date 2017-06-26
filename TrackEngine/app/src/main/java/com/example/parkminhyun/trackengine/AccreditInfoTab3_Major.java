package com.example.parkminhyun.trackengine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccreditInfoTab3_Major extends Fragment {

    public String spotName;
    private LinearLayout inflatedLayout;
    private List<Item> items;
    private RecyclerView rv;
    AccreditAdapter adapter;
    private List<String> subjects;
    ExpandableListAdapter expandableListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        inflatedLayout = (LinearLayout) inflater.inflate(R.layout.accredit_tab, container, false);
        subjects= Arrays.asList("C프로그래밍및실습","공학설계기초","고급C프로그래밍및실습",
                "자료구조및실습","알고리즘및실습","컴퓨터구조론","운영체제","컴퓨터네트워크",
                "웹프로그래밍","데이터베이스","네트워크프로그래밍","인공지능");

        expandableListAdapter = new ExpandableListAdapter(getActivity());
        List<String> userStudy = expandableListAdapter.loadStudyDataList();

        items = new ArrayList<>();

        String str="";
        boolean isMatch;
        for(int i=0;i<subjects.size();i++)
        {
            isMatch=false;
            for(int j=0;j<userStudy.size();j++)
            {
                str=userStudy.get(j).toString().replaceAll(" ",""); //공백 제거
                Log.i("str==",str);
                Log.i("subjects.get(i)==",subjects.get(i));
                if(str.equals(subjects.get(i).toString()))
                {
                    isMatch=true;
                }
            }
            if(isMatch==false)
                items.add(new Item(subjects.get(i).toString()));
        }

        rv = (RecyclerView) inflatedLayout.findViewById(R.id.accredit_rv);
        rv.setHasFixedSize(true);
        adapter = new AccreditAdapter(getActivity(),items);
        rv.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        setContentWork();
        return inflatedLayout;
    }

    public void setContentWork() {

    }

}