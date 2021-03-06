package com.example.parkminhyun.trackengine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainTab1 extends Fragment implements AdapterCallback {

    private CalculateTrackCompleteNum calculateTrackCompleteNum;

    private StringBuilder stringBuilder;
    String[] itemStudys;

    private TextView nameText;
    public String spotName;
    private View inflatedView;

    private List<String> userStudy;
    private List<Item> items;
    public static RecyclerView rv;
    RVAdapter adapter;
    Button registerStudyBtn;
    private ImageView imageView;
    CardView cv_Engineer;
    public static Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.pager_main1, container, false);
        rv = (RecyclerView) inflatedView.findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        // user 선택한 과목에서 Track 이수학점 계산하기
        calculateTrackCompleteNum = new CalculateTrackCompleteNum(getActivity());
        stringBuilder = calculateTrackCompleteNum.calculateTrackComplete();
        String userStudys = stringBuilder.toString();
        itemStudys = userStudys.split(",");

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

        adapter = new RVAdapter(getActivity(), items,itemStudys);
        rv.setAdapter(adapter);

        registerStudyBtn = (Button)inflatedView.findViewById(R.id.registerStudyBtn);
        registerStudyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerStudy = new Intent(getActivity(), RegisterStudyActivity.class);
                startActivity(registerStudy);
            }
        });

        imageView=(ImageView)inflatedView.findViewById(R.id.imageView);
        imageView.setOnClickListener(btnListener);
        cv_Engineer = (CardView)inflatedView.findViewById(R.id.cv_engine_main);
        cv_Engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AccreditInfoActivity.class));
            }
        });

        setContentView(spotName);
        return inflatedView;
    }

    Button.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imageView:
                    Intent accreditIntent=new Intent(getActivity(),AccreditInfoActivity.class);
                    startActivity(accreditIntent);
                    break;
            }
        }
    };

    @Override
    public void startEachActivity(int position) {
        switch(position){ // SW융합대학 트랙 별 이수체제도 하위 아이템 position을 읽어서 해당 포지션에 매칭되는 activity 실행
            case 0:
                startActivity(new Intent(getActivity(), VirtualRealityActivity.class));
                break;
            default:
                break;
        }
    }

    public void setContentView(String spotName) {

    }



}