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

public class ApplicationSWActivity extends AppCompatActivity {

    ImageView titleBarImage;
    private List<Subject> subjects;
    private RecyclerView rvSubject;
    RVAdapterVirtualReality adapter;
    ExpandableListAdapter expandableListAdapter;

    ImageView TroubleshootingAndPracticeImageView, multiMediaProgrammingImageView, windowProgrammingView,
            mobileProgrammingImageView,webServerProgrammingImageView,digitalSoundImageView,imageProcessingImageView,
            computerVisionSystemImageView,VoiceProcessingSoftwareImageView;
//
//    TextView multiMediaProgrammingTextView, computerGraphicsTextView, premiumRealTimeGraphicsTextView,
//            multiMediaTextView,gameProgrammingTextView,digitalSoundTextView,virtualRealityTextView,
//            computerAnimationTextView,augmentedRealityTextView,HCIIntroductionTextView;
//
//
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
        windowProgrammingView = (ImageView)findViewById(R.id.windowProgrammingView);
        mobileProgrammingImageView = (ImageView)findViewById(R.id.mobileProgrammingImageView);
        digitalSoundImageView = (ImageView)findViewById(R.id.digitalSoundImageView);
        webServerProgrammingImageView = (ImageView)findViewById(R.id.webServerProgrammingImageView);
        imageProcessingImageView = (ImageView)findViewById(R.id.imageProcessingImageView);
        computerVisionSystemImageView = (ImageView)findViewById(R.id.computerVisionSystemImageView);
        VoiceProcessingSoftwareImageView = (ImageView)findViewById(R.id.VoiceProcessingSoftwareImageView);

        subjects = new ArrayList<>();
        expandableListAdapter = new ExpandableListAdapter(this);
        List<String> userStudy = expandableListAdapter.loadStudyDataList();

        for(int i=0; i< userStudy.size(); i++) {
            switch (userStudy.get(i).toString()) {
                case "문제해결 및 실습: C++":
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    multiMediaProgrammingTextView.setTextColor(Color.BLACK);
//                    subjects.remove(0); break;
                case "멀티미디어 프로그래밍":
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    multiMediaTextView.setTextColor(Color.BLACK);
//                    subjects.remove(1); break;
                case "윈도우즈 프로그래밍":
                    windowProgrammingView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    computerGraphicsTextView.setTextColor(Color.BLACK);
//                    subjects.remove(2); break;
                case "모바일 프로그래밍":
                    mobileProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    gameProgrammingTextView.setTextColor(Color.BLACK);
//                    subjects.remove(3); break;
                case "웹프로그래밍":
                    webServerProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    premiumRealTimeGraphicsTextView.setTextColor(Color.BLACK);
//                    subjects.remove(4); break;
                case "디지털 사운드":
                    digitalSoundImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    digitalSoundTextView.setTextColor(Color.BLACK);
//                    subjects.remove(5); break;
                case "영상처리":
                    imageProcessingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    virtualRealityTextView.setTextColor(Color.BLACK);
//                    subjects.remove(6); break;
                case "컴퓨터비전 시스템":
                    computerVisionSystemImageView.setBackgroundColor(Color.rgb(52, 152, 219));
//                    computerAnimationTextView.setTextColor(Color.BLACK);
//                    subjects.remove(7); break;
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
