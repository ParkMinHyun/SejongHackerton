package com.example.parkminhyun.trackengine;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ArtificialIntelligenceActivity extends AppCompatActivity {

    ImageView multiMediaProgrammingImageView, ArtificialIntelligenceImageView, dataBaseProgrammingImageView,
            dataAnalysisImageView,machineLearningImageView,imageProcessingImageView,patternRecognitionImageView,
            computerVisionSystemImageView,intelligentSystemImageView;

    ImageView titleBarImage;

    private List<Subject> subjects;
    private RecyclerView rvSubject;
    RVAdapterVirtualReality adapter;

    UserStudyData userStudyData;

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
        setContentView(R.layout.activity_artificial_intelligence);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        titleBarImage = (ImageView)findViewById(R.id.imageView2);
        titleBarImage.setImageResource(R.drawable.artificial_intelligence);

        multiMediaProgrammingImageView = (ImageView)findViewById(R.id.multiMediaProgrammingImageView);
        ArtificialIntelligenceImageView = (ImageView)findViewById(R.id.ArtificialIntelligenceImageView);
        dataBaseProgrammingImageView = (ImageView)findViewById(R.id.dataBaseProgrammingImageView);
        machineLearningImageView = (ImageView)findViewById(R.id.machineLearningImageView);
        imageProcessingImageView = (ImageView)findViewById(R.id.imageProcessingImageView);
        patternRecognitionImageView = (ImageView)findViewById(R.id.patternRecognitionImageView);
        dataAnalysisImageView = (ImageView)findViewById(R.id.dataAnalysisImageView);
        computerVisionSystemImageView = (ImageView)findViewById(R.id.computerVisionSystemImageView);
        intelligentSystemImageView = (ImageView)findViewById(R.id.intelligentSystemImageView);

        subjects = new ArrayList<>();
        userStudyData = new UserStudyData(this);
        List<String> userStudy = userStudyData.loadStudyDataList();

        for(int i=0; i< userStudy.size(); i++){
            switch (userStudy.get(i).toString()){
                case "멀티미디어 프로그래밍" :
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "인공지능" :
                    ArtificialIntelligenceImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "데이터베이스 프로그래밍" :
                    dataBaseProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "데이터 분석" :
                    dataAnalysisImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "기계학습" :
                    machineLearningImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "영상처리" :
                    imageProcessingImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "패턴 인식" :
                    patternRecognitionImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "컴퓨터 비전 시스템" :
                    computerVisionSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
                case "지능형 시스템" :
                    intelligentSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219)); break;
            }
        }
    }

    public void makeTransParentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}
