package com.example.parkminhyun.trackengine;

import android.content.Context;

import java.util.List;

public class CalculateTrackCompleteNum {

    private int virtualTrackStudyNum , aiTrackStudyNum, appSoftwareTrackStudyNum, hciTrackStudyNum, multiMediaTrackStudyNum
            , iotTrackStudyNum, systemAppTrackStudyNum, intelPerceptionTrackStudyNum, dataScienceTrackStudyNum, infoProtectionTrackStudyNum;

    private int virtualTrackCnt = 0, aiTrackCnt = 0, appSoftwareTrackCnt = 0, hciTrackCnt = 0, multiMediaTrackCnt = 0
            , iotTrackStudyCnt = 0, systemAppTrackCnt= 0, intelPerceptionTrackCnt = 0, dataScienceTrackCnt = 0, infoProtectionTrackCnt = 0;

    private UserStudyData userStudyData;
    private Context context;
    private List<String> userStudy;

    // 생성자
    public CalculateTrackCompleteNum(Context context){
        this.context = context;
        userStudyData = new UserStudyData(context);
        userStudy = userStudyData.loadStudyDataList();
    }

    // 계산
    public StringBuilder calculateTrackComplete(){
        for(int i=0; i<userStudy.size(); i++){
            switch (userStudy.get(i).toString()){
                case "멀티미디어" :
                    virtualTrackCnt++;
                    multiMediaTrackCnt++;
                    intelPerceptionTrackCnt++; break;
                case "컴퓨터그래픽스" :
                    virtualTrackCnt++;
                    multiMediaTrackCnt++;
                    dataScienceTrackCnt++; break;
                case "가상현실" :
                    virtualTrackCnt++;
                    multiMediaTrackCnt++;
                    intelPerceptionTrackCnt++; break;
                case "HCI 개론" :
                    virtualTrackCnt++;
                    hciTrackCnt++;
                    intelPerceptionTrackCnt++; break;

                case "인공지능" :
                    aiTrackCnt++;
                    intelPerceptionTrackCnt++; break;
                case "패턴 인식":
                    aiTrackCnt++;
                    multiMediaTrackCnt++;
                    intelPerceptionTrackCnt++; break;
                case "영상처리" :
                    aiTrackCnt++;
                    appSoftwareTrackCnt++;
                    hciTrackCnt++; break;

                case "문제해결 및 실습: C++" :
                    appSoftwareTrackCnt++; break;
                case "윈도우즈 프로그래밍":
                    appSoftwareTrackCnt++;
                    intelPerceptionTrackCnt++; break;
                case "모바일 프로그래밍":
                    appSoftwareTrackCnt++;
                    multiMediaTrackCnt++; break;
                case "웹프로그래밍" :
                    appSoftwareTrackCnt++;
                    hciTrackCnt++;
                    iotTrackStudyCnt++;
                    intelPerceptionTrackCnt++; break;

                case "웹 프로그래밍 설계" :
                    hciTrackCnt++; break;
                case "웹 기반 시스템" :
                    hciTrackCnt++; break;
                case "XML 프로그래밍" :
                    hciTrackCnt++; break;
                case "디지털 신호처리" :
                    hciTrackCnt++;
                    multiMediaTrackCnt++;
                    iotTrackStudyCnt++; break;
                case "정보검색" :
                    hciTrackCnt++;
                    intelPerceptionTrackCnt++; break;

                case "신호 및 시스템" :
                    multiMediaTrackCnt++;
                    iotTrackStudyCnt++; break;
                case "영상처리 프로그래밍" :
                    multiMediaTrackCnt++; break;

                case "통신 시스템" :
                    iotTrackStudyCnt++; break;
                case "네트워크 프로그래밍" :
                    iotTrackStudyCnt++; break;
                case "정보보호개론" :
                    iotTrackStudyCnt++; break;
                case "데이터 통신" :
                    iotTrackStudyCnt++; break;
                case "임베디드 시스템" :
                    iotTrackStudyCnt++;
                    systemAppTrackCnt++; break;
                case "무선통신" :
                    iotTrackStudyCnt++; break;
                case "스마트 그리드" :
                    iotTrackStudyCnt++; break;
                case "인터넷 보안" :
                    iotTrackStudyCnt++;
                    infoProtectionTrackCnt++; break;

                case "마이크로 컴퓨터" :
                    systemAppTrackCnt++; break;
                case "데이터베이스" :
                    systemAppTrackCnt++;
                    intelPerceptionTrackCnt++;
                    dataScienceTrackCnt++; break;
                case "프로그래밍 언어의 개념" :
                    systemAppTrackCnt++; break;
                case "VHDL 프로그래밍" :
                    systemAppTrackCnt++; break;
                case "UNIX 프로그래밍" :
                    systemAppTrackCnt++; break;
                case "소프트웨어 공학" :
                    systemAppTrackCnt++; break;
                case "멀티코어 프로그래밍" :
                    systemAppTrackCnt++; break;
                case "시스템 모델링" :
                    systemAppTrackCnt++; break;
                case "분산 시스템" :
                    systemAppTrackCnt++; break;
                case "컴파일러" :
                    systemAppTrackCnt++; break;

                case "컴퓨터 네트워크":
                    infoProtectionTrackCnt++; break;
                case "운영체제":
                    infoProtectionTrackCnt++; break;

            }
        }

        if(virtualTrackCnt>6)
            virtualTrackStudyNum = 100;
        else
            virtualTrackStudyNum = (int)(virtualTrackCnt / 6.0 * 100);

        if(aiTrackCnt>6)
            aiTrackStudyNum = 100;
        else
            aiTrackStudyNum = (int)(aiTrackCnt / 6.0 * 100);

        if(appSoftwareTrackCnt>6)
            appSoftwareTrackStudyNum = 100;
        else
            appSoftwareTrackStudyNum = (int)(appSoftwareTrackCnt / 6.0 * 100);

        if(hciTrackCnt>6)
            hciTrackStudyNum = 100;
        else
            hciTrackStudyNum = (int)(hciTrackCnt / 6.0 * 100);

        if(multiMediaTrackCnt>6)
            multiMediaTrackStudyNum = 100;
        else
            multiMediaTrackStudyNum = (int)(multiMediaTrackCnt / 6.0 * 100);

        if(iotTrackStudyCnt>6)
            iotTrackStudyNum = 100;
        else
            iotTrackStudyNum = (int)(iotTrackStudyCnt / 6.0 * 100);

        if(systemAppTrackCnt>6)
            systemAppTrackStudyNum = 100;
        else
            systemAppTrackStudyNum = (int)(systemAppTrackCnt / 6.0 * 100);

        if(intelPerceptionTrackCnt>6)
            intelPerceptionTrackStudyNum = 100;
        else
            intelPerceptionTrackStudyNum = (int)(intelPerceptionTrackCnt / 6.0 * 100);

        if(dataScienceTrackCnt>6)
            dataScienceTrackStudyNum = 100;
        else
            dataScienceTrackStudyNum = (int)(dataScienceTrackCnt / 6.0 * 100);

        if(infoProtectionTrackCnt>6)
            infoProtectionTrackStudyNum = 100;
        else
            infoProtectionTrackStudyNum = (int)(infoProtectionTrackCnt / 6.0 * 100);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(virtualTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(aiTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(appSoftwareTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(hciTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(multiMediaTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(iotTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(systemAppTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(intelPerceptionTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(dataScienceTrackStudyNum); stringBuilder.append(",");
        stringBuilder.append(infoProtectionTrackStudyNum); stringBuilder.append(",");

        return stringBuilder;
    }



}
