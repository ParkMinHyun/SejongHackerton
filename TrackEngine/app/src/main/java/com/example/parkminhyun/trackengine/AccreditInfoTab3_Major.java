package com.example.parkminhyun.trackengine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class AccreditInfoTab3_Major extends Fragment {

    public String spotName;
    private LinearLayout inflatedLayout;
    private List<Item> items;
    private RecyclerView rv;
    AccreditAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        inflatedLayout = (LinearLayout) inflater.inflate(R.layout.accredit_tab, container, false);

        items = new ArrayList<>();
        items.add(new Item("데이터베이스"));
        items.add(new Item("컴퓨터그래픽스"));
        items.add(new Item("프로그래밍언어의개념"));
        items.add(new Item("컴퓨터네트워크"));
        items.add(new Item("UNIX프로그래밍"));
        items.add(new Item("디지털신호처리"));
        items.add(new Item("네트워크프로그래밍"));
        items.add(new Item("인공지능"));
        items.add(new Item("임베디드시스템"));
        items.add(new Item("Capstone디자인산학협력프로젝트"));


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