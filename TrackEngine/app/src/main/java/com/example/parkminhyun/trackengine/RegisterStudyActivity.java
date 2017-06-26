package com.example.parkminhyun.trackengine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterStudyActivity extends AppCompatActivity {

    CalculateTrackCompleteNum calculateTrackCompleteNum;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    RVAdapter adapter;

    private List<Item> items;
    String[] itemStudys;
    List<String> listDataHeader;
    List<String> studyNameList;
    HashMap<String, List<String>> listDataChild;

    Button saveBtn;
    List<String> semester1_1,semester1_2,semester2_1,semester2_2,semester3_1,semester3_2,semester4_1,semester4_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_study);

        saveBtn = (Button)findViewById(R.id.saveBtn);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        listAdapter.loadStudyData();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),"저장 완료되었습니다.",Toast.LENGTH_SHORT);
                toast.show();

                studyNameList = listAdapter.get_studyCheckList();

                StringBuilder stringBuilder = new StringBuilder();
                for(String s : studyNameList){
                    stringBuilder.append(s);
                    stringBuilder.append(",");
                }
                SharedPreferences settings = getSharedPreferences("PREFS",0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("studyNameList",stringBuilder.toString());
                editor.commit();


                //Save 후 Adapter 갱신
                //
                // user 선택한 과목에서 Track 이수학점 계산하기
                calculateTrackCompleteNum = new CalculateTrackCompleteNum(getApplicationContext());
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

                adapter = new RVAdapter(getApplicationContext(), items,itemStudys);
                MainTab1.rv.setAdapter(adapter);

                // 자동 종료
                finish();
            }
        });

        // list Adapter 셋팅
        expListView.setAdapter(listAdapter);
    }

    // list 아이템 셋팅
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("1학년 1학기");
        listDataHeader.add("1학년 2학기");
        listDataHeader.add("2학년 1학기");
        listDataHeader.add("2학년 2학기");
        listDataHeader.add("3학년 1학기");
        listDataHeader.add("3학년 2학기");
        listDataHeader.add("4학년 1학기");
        listDataHeader.add("4학년 2학기");

        // Adding child data
        semester1_1 = new ArrayList<String>();
        semester1_1.add("C 프로그래밍 및 실습");
        semester1_1.add("일반 물리학 및 실험1");
        semester1_1.add("미적분학 및 연습1");
        semester1_1.add("English Listening Practice 1");

        semester1_2 = new ArrayList<String>();
        semester1_2.add("공학설계기초");
        semester1_2.add("고급 C 프로그래밍 및 실습");
        semester1_2.add("전산개론-I");
        semester1_2.add("공업수학1");
        semester1_2.add("English Listening Practice 2");

        semester2_1 = new ArrayList<String>();
        semester2_1.add("윈도우즈 프로그래밍");
        semester2_1.add("디지털시스템");
        semester2_1.add("웹프로그래밍");
        semester2_1.add("문제해결 및 실습: C++");
        semester2_1.add("자료구조 및 실습");
        semester2_1.add("English Writing 1");

        semester2_2 = new ArrayList<String>();
        semester2_2.add("오픈소스 SW 개론");
        semester2_2.add("멀티미디어");
        semester2_2.add("문제해결 및 실습: JAVA");
        semester2_2.add("알고리즘 및 실습");
        semester2_2.add("마이크로 컴퓨터");
        semester2_2.add("컴퓨터 구조론");
        semester2_2.add("이산 수학 및 프로그래밍");
        semester2_2.add("English Writing 2");

        semester3_1 = new ArrayList<String>();
        semester3_1.add("신호 및 시스템");
        semester3_1.add("오픈소스 SW 공학");
        semester3_1.add("웹 프로그래밍 설계");
        semester3_1.add("C# 프로그래밍");
        semester3_1.add("데이터베이스");
        semester3_1.add("운영체제");
        semester3_1.add("컴퓨터그래픽스");
        semester3_1.add("VHDL 프로그래밍");
        semester3_1.add("프로그래밍 언어의 개념");
        semester3_1.add("확률 통계 및 프로그래밍");

        semester3_2 = new ArrayList<String>();
        semester3_2.add("통신 시스템");
        semester3_2.add("디지털 신호처리");
        semester3_2.add("심화 프로그래밍 설계");
        semester3_2.add("멀티코어 프로그래밍");
        semester3_2.add("XML 프로그래밍");
        semester3_2.add("컴퓨터 네트워크");
        semester3_2.add("UNIX 프로그래밍");
        semester3_2.add("소프트웨어 공학");
        semester3_2.add("웹 기반 시스템");
        semester3_2.add("멀티미디어 데이터베이스");
        semester3_2.add("선형 대수 및 프로그래밍");
        semester3_2.add("Technical Writing 기초");

        semester4_1 = new ArrayList<String>();
        semester4_1.add("패턴 인식");
        semester4_1.add("데이터 통신");
        semester4_1.add("데이터 컴퓨팅");
        semester4_1.add("시스템 모델링");
        semester4_1.add("무선통신");
        semester4_1.add("영상처리");
        semester4_1.add("Capstone 디자인 산학협력프로젝트");
        semester4_1.add("네트워크 프로그래밍");
        semester4_1.add("인공지능");
        semester4_1.add("정보보호개론");
        semester4_1.add("가상현실");
        semester4_1.add("소프트웨어 특강");
        semester4_1.add("임베디드 시스템");
        semester4_1.add("인턴십(3-0)");
        semester4_1.add("인턴십(12-0)");

        semester4_2 = new ArrayList<String>();
        semester4_2.add("특허와 창업");
        semester4_2.add("분산 시스템");
        semester4_2.add("스마트 그리드");
        semester4_2.add("영상처리 프로그래밍");
        semester4_2.add("컴퓨터비전 시스템");
        semester4_2.add("소프트웨어 특강2");
        semester4_2.add("HCI 개론");
        semester4_2.add("정보검색");
        semester4_2.add("모바일 프로그래밍");
        semester4_2.add("지능형 시스템");
        semester4_2.add("인터넷 보안");
        semester4_2.add("컴파일러");
        semester4_2.add("인턴십(3-0)");
        semester4_2.add("인턴십(12-0)");

        listDataChild.put(listDataHeader.get(0), semester1_1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), semester1_2);
        listDataChild.put(listDataHeader.get(2), semester2_1);
        listDataChild.put(listDataHeader.get(3), semester2_2);
        listDataChild.put(listDataHeader.get(4), semester3_1);
        listDataChild.put(listDataHeader.get(5), semester3_2);
        listDataChild.put(listDataHeader.get(6), semester4_1);
        listDataChild.put(listDataHeader.get(7), semester4_2);
    }
}