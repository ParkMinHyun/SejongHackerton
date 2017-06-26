package com.example.parkminhyun.trackengine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainTab2 extends Fragment {

    private TextView nameText;
    public String spotName;
    private View inflatedView;
    private List<MapVO> maps;
    private RecyclerView rvMap;
    RVAdapterMap adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.pager_main2, container, false);

        rvMap = (RecyclerView) inflatedView.findViewById(R.id.rv_tab2);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rvMap.setLayoutManager(llm);
        rvMap.setHasFixedSize(true);

        maps = new ArrayList<>();
        maps.add(new MapVO("1. 가상현실 트랙", "멀티미디어 프로그래밍", "멀티미디어", "컴퓨터그래픽스", "게임 프로그래밍", "고급 실시간 그래픽스", "      ", "디지털 사운드", "가상현실", "컴퓨터애니메이션", "증강현실", "HCI개론"));
        maps.add(new MapVO("2. 인공지능 트랙", "멀티미디어 프로그래밍", "인공지능", "데이터베이스 프로그래밍", "데이터분석", "     ", "기계학습", "     ", "영상처리", "패턴인식", "컴퓨터비전 시스템", "지능형 시스템"));
        maps.add(new MapVO("3. 응용 SW 트랙", "문제해결 및 실습: C++", "멀티미디어 프로그래밍", "윈도우즈 프로그래밍", "모바일 프로그래밍", "     ", "웹 프로그래밍", "     ", "디지털 사운드", "영상처리", "컴퓨터비전 시스템", "음성처리SW"));
        maps.add(new MapVO("4. HCI & VC 트랙", "웹프로그래밍", "웹프로그래밍 설계", "컴퓨터그래픽스", "웹기반 시스템", "XML 프로그래밍", "디지털 신호처리", "     ", "데이터 컴퓨팅", "영상처리", "정보검색", "HCI 개론"));
        maps.add(new MapVO("5. 멀티미디어 트랙", "멀티미디어", "신호및시스템", "컴퓨터그래픽스", "멀티미디어 데이터베이스", "디지털 신호처리", "패턴인식", "영상처리", "가상현실", "컴퓨터비전 시스템", "영상처리 프로그래밍", "모바일 프로그래밍"));
        maps.add(new MapVO("6. 사물인터넷 트랙", "웹프로그래밍", "신호및시스템", "통신시스템", "디지털 신호처리", "네트워크 프로그래밍", "정보보호개론", "데이터 통신", "임베디드 시스템", "무선통신", "스마트 그리드", "인터넷 보안"));
        maps.add(new MapVO("7. 시스템응용 트랙", "마이크로 컴퓨터", "데이터베이스", "프로그래밍 언어의 개념", "VHDL 프로그래밍", "UNIX 프로그래밍", "소프트웨어 공학", "멀티코어 프로그래밍", "시스템모델링", "임베디드 시스템", "분산 시스템", "컴파일러"));
        maps.add(new MapVO("8. 지능형인지 트랙", "웹프로그래밍", "윈도우즈 프로그래밍", "멀티미디어", "데이터베이스", "패턴인식", "      ", "인공지능", "가상현실", "정보검색", "지능형시스템", "HCI개론"));
        maps.add(new MapVO("9. 데이터사이언스 트랙", "데이터분석 개론", "비즈니스 인텔리전스", "데이터베이스", "컴퓨터그래픽스", "기계학습", "     ", "데이터 시각화", "대용량데이터 처리개론", "텍스트 마이닝", "의사결정 모델링", "데이터기반 인공지능"));
        maps.add(new MapVO("10. 정보보호 트랙", "컴퓨터 네트워크", "보안 프로그래밍", "어셈블리어", "대칭키암호론", "운영체제", "공개키 암호론", "시스템 해킹과보안", "인터넷보안", "악성코드 분석", "네트워크 해킹과보안", "디지털 포렌식"));

        adapter = new RVAdapterMap(maps, getActivity());
        rvMap.setAdapter(adapter);

        return inflatedView;
    }
}

