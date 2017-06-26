package com.example.parkminhyun.trackengine;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.example.parkminhyun.trackengine.R.id.rv_main_test;

public class MainTest extends AppCompatActivity {

    ImageView titleBarImage;
    private List<MapVO> maps;
    private RecyclerView rvMap;
    RVAdapterMap adapter;

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
        setContentView(R.layout.activity_main_test);
        titleBarImage = (ImageView)findViewById(R.id.imageView2);
        titleBarImage.setImageResource(R.drawable.virtual_track_title);

        rvMap = (RecyclerView) findViewById(rv_main_test);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvMap.setLayoutManager(llm);
        rvMap.setHasFixedSize(true);

        maps = new ArrayList<>();
        maps.add(new MapVO("1. 가상현실 트랙", "멀티미디어 프로그래밍", "멀티미디어", "컴퓨터 그래픽스", "게임 프로그래밍", "고급 실시간 그래픽스", "", "디지털 사운드", "가상현실", "컴퓨터애니메이션", "증강현실", "HCI개론"));
        maps.add(new MapVO("2. 인공지능 트랙", "멀티미디어 프로그래밍", "인공지능", "데이터베이스 프로그래밍", "데이터분석", "", "기계학습", "", "영상처리", "패턴인식", "컴퓨터비젼 시스템", "지능형 시스템"));
        maps.add(new MapVO("3. 응용 SW 트랙", "문제해결및실습:C++", "멀티미디어 프로그래밍", "윈도우 프로그래밍", "모바일 프로그래밍", "", "웹 프로그래밍", "", "디지털 사운드", "영상처리", "컴퓨터비젼 시스템", "음성처리SW"));
        maps.add(new MapVO("4. HCI & VC 트랙", "웹 프로그래밍", "웹프로그래밍 설계", "컴퓨터 그래픽스", "웹기반 시스템", "XML 프로그래밍", "디지털 신호처리", "", "데이터 컴퓨팅", "영상처리", "정보검색", "HCI개론"));
        maps.add(new MapVO("5. 멀티미디어 트랙", "멀티미디어", "신호및시스템", "컴퓨터그래픽스", "멀티미디어 데이터베이스", "디지털 신호처리", "패턴인식", "영상처리", "가상현실", "컴퓨터 비전시스템", "영상처리 프로그래밍", "모바일 프로그래밍"));
        maps.add(new MapVO("6. 사물인터넷 트랙", "웹 프로그래밍", "신호및시스템", "통신시스템", "디지털 신호처리", "네트워크 프로그래밍", "정보보호개론", "데이터통신", "임베디드 시스템", "무선통신", "스마트 그리드", "인터넷보안"));
        maps.add(new MapVO("7. 시스템응용 트랙", "마이크로 컴퓨터", "데이터베이스", "프로그래밍 언어의개념", "VHDL 프로그래밍", "UNIX 프로그래밍", "소프트웨어 공학", "멀티코어 프로그래밍", "시스템모델링", "임베디드 시스템", "분산시스템", "컴파일러"));
        maps.add(new MapVO("8. 지능형인지 트랙", "웹 프로그래밍", "윈도우즈 프로그래밍", "멀티미디어", "데이터베이스", "패턴인식", "", "인공지능", "가상현실", "정보검색", "지능형시스템", "HCI개론"));
        maps.add(new MapVO("9. 데이터사이언스 트랙", "데이터분석 개론", "비즈니스 인텔리전스", "데이터베이스", "컴퓨터 그래픽스", "기계학습", "", "데이터 시각화", "대용량데이터 처리개론", "텍스트 마이닝", "의사결정 모델링", "데이터기반 인공지능"));
        maps.add(new MapVO("10. 정보보호 트랙", "컴퓨터 네트워크", "보안 프로그래밍", "어셈블리어", "대칭키암호론", "운영체제", "공개키 암호론", "시스템 해킹과보안", "인터넷보안", "악성코드 분석", "네트워크 해킹과보안", "디지털 포렌식"));

        adapter = new RVAdapterMap(maps);
        rvMap.setAdapter(adapter);
    }

    public void makeTransParentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

}
