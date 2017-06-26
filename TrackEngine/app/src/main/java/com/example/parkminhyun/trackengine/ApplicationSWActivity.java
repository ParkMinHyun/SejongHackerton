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

public class ApplicationSWActivity extends AppCompatActivity {

    ImageView titleBarImage;
    private List<Subject> subjects;
    private RecyclerView rvSubject;
    RVAdapterVirtualReality adapter;
    UserStudyData userStudyData;

    ImageView TroubleshootingAndPracticeImageView, multiMediaProgrammingImageView, windowProgrammingImageView,
            mobileProgrammingImageView,webServerProgrammingImageView,digitalSoundImageView,imageProcessingImageView,
            computerVisionSystemImageView,VoiceProcessingSoftwareImageView;

    TextView TroubleshootingAndPracticeTextView, multiMediaProgrammingTextView, windowProgrammingTextView,
            mobileProgrammingTextView,webServerProgrammingTextView,digitalSoundTextView,imageProcessingTextView,
            computerVisionSystemTextView,VoiceProcessingSoftwareTextView;


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
        setContentView(R.layout.activity_application_sw);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        titleBarImage = (ImageView)findViewById(R.id.imageView2);
        titleBarImage.setImageResource(R.drawable.application_sw_title);


        multiMediaProgrammingImageView = (ImageView)findViewById(R.id.multiMediaProgrammingImageView);
        TroubleshootingAndPracticeImageView = (ImageView)findViewById(R.id.TroubleshootingAndPracticeImageView);
        windowProgrammingImageView = (ImageView)findViewById(R.id.windowProgrammingImageView);
        mobileProgrammingImageView = (ImageView)findViewById(R.id.mobileProgrammingImageView);
        digitalSoundImageView = (ImageView)findViewById(R.id.digitalSoundImageView);
        webServerProgrammingImageView = (ImageView)findViewById(R.id.webServerProgrammingImageView);
        imageProcessingImageView = (ImageView)findViewById(R.id.imageProcessingImageView);
        computerVisionSystemImageView = (ImageView)findViewById(R.id.computerVisionSystemImageView);
        VoiceProcessingSoftwareImageView = (ImageView)findViewById(R.id.VoiceProcessingSoftwareImageView);

        TroubleshootingAndPracticeTextView = (TextView) findViewById(R.id.TroubleshootingAndPracticeTextView);
        multiMediaProgrammingTextView = (TextView)findViewById(R.id.multiMediaProgrammingTextView);
        windowProgrammingTextView = (TextView)findViewById(R.id.windowProgrammingTextView);
        mobileProgrammingTextView = (TextView)findViewById(R.id.mobileProgrammingTextView);
        webServerProgrammingTextView = (TextView)findViewById(R.id.webServerProgrammingTextView);
        digitalSoundTextView = (TextView)findViewById(R.id.digitalSoundTextView);
        imageProcessingTextView = (TextView)findViewById(R.id.imageProcessingTextView);
        computerVisionSystemTextView = (TextView)findViewById(R.id.computerVisionSystemTextView);
        VoiceProcessingSoftwareTextView = (TextView)findViewById(R.id.VoiceProcessingSoftwareTextView);

        rvSubject = (RecyclerView) findViewById(R.id.rv_subject);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvSubject.setLayoutManager(llm);
        rvSubject.setHasFixedSize(true);

        subjects = new ArrayList<>();
        userStudyData = new UserStudyData(this);
        List<String> userStudy = userStudyData.loadStudyDataList();

        subjects.add(new Subject("[2-1]", "문제해결 및 실습:C++"));
        subjects.add(new Subject("[2-1]", "멀티미디어 프로그래밍"));
        subjects.add(new Subject("[2-2]", "윈도우즈 프로그래밍"));
        subjects.add(new Subject("[3-1]", "모바일 프로그래밍"));
        subjects.add(new Subject("[3-2]", "웹 프로그래밍"));
        subjects.add(new Subject("[3-2]", "디지털 사운드"));
        subjects.add(new Subject("[4-1]", "영상처리"));
        subjects.add(new Subject("[4-2]", "컴퓨터 비전 시스템"));
        subjects.add(new Subject("[4-2]", "음성처리 SW"));
        for(int i=0; i< userStudy.size(); i++) {
            switch (userStudy.get(i).toString()) {
                case "문제해결 및 실습: C++":
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    TroubleshootingAndPracticeTextView.setTextColor(Color.BLACK);
                    subjects.remove(0); break;
                case "멀티미디어 프로그래밍":
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    multiMediaProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(1); break;
                case "윈도우즈 프로그래밍":
                    windowProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    windowProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(2); break;
                case "모바일 프로그래밍":
                    mobileProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    mobileProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(3); break;
                case "웹프로그래밍":
                    webServerProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    webServerProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(4); break;
                case "디지털 사운드":
                    digitalSoundImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    digitalSoundTextView.setTextColor(Color.BLACK);
                    subjects.remove(5); break;
                case "영상처리":
                    imageProcessingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    imageProcessingTextView.setTextColor(Color.BLACK);
                    subjects.remove(6); break;
                case "컴퓨터비전 시스템":
                    computerVisionSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    VoiceProcessingSoftwareTextView.setTextColor(Color.BLACK);
                    subjects.remove(7); break;
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
