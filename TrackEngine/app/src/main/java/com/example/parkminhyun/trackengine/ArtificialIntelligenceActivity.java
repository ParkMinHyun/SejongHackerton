package com.example.parkminhyun.trackengine;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArtificialIntelligenceActivity extends AppCompatActivity {

    ImageView multiMediaProgrammingImageView, ArtificialIntelligenceImageView, dataBaseProgrammingImageView,
            dataAnalysisImageView,machineLearningImageView,imageProcessingImageView,patternRecognitionImageView,
            computerVisionSystemImageView,intelligentSystemImageView;

    TextView multiMediaProgrammingTextView, ArtificialIntelligenceTextView, dataBaseProgrammingTextView,
            dataAnalysisTextView,machineLearningTextView,imageProcessingTextView,patternRecognitionTextView,
            computerVisionSystemTextView,intelligentSystemTextView;

    TextView customBarTextView;

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
        getSupportActionBar().setCustomView(R.layout.custom_bar_text);

//        titleBarImage = (ImageView)findViewById(R.id.imageView2);
//        titleBarImage.setImageResource(R.drawable.artificial_intelligence);

        rvSubject = (RecyclerView) findViewById(R.id.rv_subject);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvSubject.setLayoutManager(llm);
        rvSubject.setHasFixedSize(true);

        multiMediaProgrammingImageView = (ImageView)findViewById(R.id.multiMediaProgrammingImageView);
        ArtificialIntelligenceImageView = (ImageView)findViewById(R.id.ArtificialIntelligenceImageView);
        dataBaseProgrammingImageView = (ImageView)findViewById(R.id.dataBaseProgrammingImageView);
        machineLearningImageView = (ImageView)findViewById(R.id.machineLearningImageView);
        imageProcessingImageView = (ImageView)findViewById(R.id.imageProcessingImageView);
        patternRecognitionImageView = (ImageView)findViewById(R.id.patternRecognitionImageView);
        dataAnalysisImageView = (ImageView)findViewById(R.id.dataAnalysisImageView);
        computerVisionSystemImageView = (ImageView)findViewById(R.id.computerVisionSystemImageView);
        intelligentSystemImageView = (ImageView)findViewById(R.id.intelligentSystemImageView);

        multiMediaProgrammingTextView = (TextView) findViewById(R.id.multiMediaProgrammingTextView);
        ArtificialIntelligenceTextView = (TextView)findViewById(R.id.ArtificialIntelligenceTextView);
        dataBaseProgrammingTextView = (TextView)findViewById(R.id.dataBaseProgrammingTextView);
        dataAnalysisTextView = (TextView)findViewById(R.id.dataAnalysisTextView);
        machineLearningTextView = (TextView)findViewById(R.id.machineLearningTextView);
        imageProcessingTextView = (TextView)findViewById(R.id.imageProcessingTextView);
        patternRecognitionTextView = (TextView)findViewById(R.id.patternRecognitionTextView);
        computerVisionSystemTextView = (TextView)findViewById(R.id.computerVisionSystemTextView);
        intelligentSystemTextView = (TextView)findViewById(R.id.intelligentSystemTextView);

        customBarTextView = (TextView)findViewById(R.id.customTextView);
        customBarTextView.setText("인공지능 트랙 이수표");

        subjects = new ArrayList<>();
        userStudyData = new UserStudyData(this);
        List<String> userStudy = userStudyData.loadStudyDataList();

        subjects.add(new Subject("[2-1]", "멀티미디어 프로그래밍"));
        subjects.add(new Subject("[3-2]", "인공지능"));
        subjects.add(new Subject("[3-2]", "데이터베이스 프로그래밍"));
        subjects.add(new Subject("[3-2]", "데이터 분석"));
        subjects.add(new Subject("[4-1]", "기계학습"));
        subjects.add(new Subject("[4-1]", "영상처리"));
        subjects.add(new Subject("[4-2]", "패턴 인식"));
        subjects.add(new Subject("[4-2]", "컴퓨터비전 시스템"));
        subjects.add(new Subject("[4-2]", "지능형 시스템"));
        for(int i=0; i< userStudy.size(); i++){
            switch (userStudy.get(i).toString()){
                case "멀티미디어 프로그래밍" :
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    multiMediaProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(0); break;
                case "인공지능" :
                    ArtificialIntelligenceImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    ArtificialIntelligenceTextView.setTextColor(Color.BLACK);
                    subjects.remove(1); break;
                case "데이터베이스 프로그래밍" :
                    dataBaseProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    dataBaseProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(2); break;
                case "데이터 분석" :
                    dataAnalysisImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    dataAnalysisTextView.setTextColor(Color.BLACK);
                    subjects.remove(3); break;
                case "기계학습" :
                    machineLearningImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    machineLearningTextView.setTextColor(Color.BLACK);
                    subjects.remove(4); break;
                case "영상처리" :
                    imageProcessingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    imageProcessingTextView.setTextColor(Color.BLACK);
                    subjects.remove(5); break;
                case "패턴 인식" :
                    patternRecognitionImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    patternRecognitionTextView.setTextColor(Color.BLACK);
                    subjects.remove(6); break;
                case "컴퓨터 비전 시스템" :
                    computerVisionSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    computerVisionSystemTextView.setTextColor(Color.BLACK);
                    subjects.remove(7); break;
                case "지능형 시스템" :
                    intelligentSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    intelligentSystemTextView.setTextColor(Color.BLACK);
                    subjects.remove(8); break;
            }
        }
        adapter = new RVAdapterVirtualReality(this, subjects);
        rvSubject.setAdapter(adapter);
    }

    public void makeTransParentStatusBar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}
