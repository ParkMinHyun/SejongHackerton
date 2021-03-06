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

public class VirtualRealityActivity extends AppCompatActivity {

    ImageView titleBarImage;
    ImageView multiMediaProgrammingImageView, computerGraphicsImageView, premiumRealTimeGraphicsImageView,
            multiMediaImageView,gameProgrammingImageView,digitalSoundImageView,virtualRealityImageView,
            computerAnimationImageView,augmentedRealityImageView,HCIIntroductionImageView;

    TextView multiMediaProgrammingTextView, computerGraphicsTextView, premiumRealTimeGraphicsTextView,
            multiMediaTextView,gameProgrammingTextView,digitalSoundTextView,virtualRealityTextView,
            computerAnimationTextView,augmentedRealityTextView,HCIIntroductionTextView;

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
        setContentView(R.layout.activity_virtual_reality);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar_text);

        multiMediaProgrammingImageView = (ImageView)findViewById(R.id.multiMediaProgrammingImageView);
        computerAnimationImageView = (ImageView)findViewById(R.id.computerGraphicsImageView);
        premiumRealTimeGraphicsImageView = (ImageView)findViewById(R.id.premiumRealTimeGraphicsImageView);
        multiMediaImageView = (ImageView)findViewById(R.id.multiMediaImageView);
        gameProgrammingImageView = (ImageView)findViewById(R.id.gameProgrammingImageView);
        digitalSoundImageView = (ImageView)findViewById(R.id.digitalSoundImageView);
        virtualRealityImageView = (ImageView)findViewById(R.id.virtualRealityImageView);
        computerAnimationImageView = (ImageView)findViewById(R.id.computerAnimationImageView);
        augmentedRealityImageView = (ImageView)findViewById(R.id.augmentedRealityImageView);
        HCIIntroductionImageView = (ImageView)findViewById(R.id.HCIIntroductionImageView);

        multiMediaProgrammingTextView = (TextView)findViewById(R.id.multiMediaProgrammingTextView);
        computerGraphicsTextView = (TextView)findViewById(R.id.computerGraphicsTextView);
        premiumRealTimeGraphicsTextView = (TextView)findViewById(R.id.premiumRealTimeGraphicsTextView);
        multiMediaTextView = (TextView)findViewById(R.id.multiMediaTextView);
        gameProgrammingTextView = (TextView)findViewById(R.id.gameProgrammingTextView);
        digitalSoundTextView = (TextView)findViewById(R.id.digitalSoundTextView);
        virtualRealityTextView = (TextView)findViewById(R.id.virtualRealityTextView);
        computerAnimationTextView = (TextView)findViewById(R.id.computerAnimationTextView);
        augmentedRealityTextView = (TextView)findViewById(R.id.augmentedRealityTextView);
        HCIIntroductionTextView = (TextView)findViewById(R.id.HCIIntroductionTextView);

//        titleBarImage = (ImageView)findViewById(R.id.imageView2);
//        titleBarImage.setImageResource(0);
        rvSubject = (RecyclerView) findViewById(R.id.rv_subject);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvSubject.setLayoutManager(llm);
        rvSubject.setHasFixedSize(true);

        subjects = new ArrayList<>();
        userStudyData = new UserStudyData(this);
        List<String> userStudy = userStudyData.loadStudyDataList();

        subjects.add(new Subject("[2-1]", "멀티미디어 프로그래밍"));
        subjects.add(new Subject("[2-1]", "멀티미디어"));
        subjects.add(new Subject("[3-1]", "컴퓨터 그래픽스"));
        subjects.add(new Subject("[3-1]", "게임 프로그래밍"));
        subjects.add(new Subject("[3-2]", "고급 실시간 그래픽스"));
        subjects.add(new Subject("[3-2]", "디지털 사운드"));
        subjects.add(new Subject("[4-1]", "가상현실"));
        subjects.add(new Subject("[4-1]", "컴퓨터 애니메이션"));
        subjects.add(new Subject("[4-2]", "증강현실"));
        subjects.add(new Subject("[4-2]", "HCI개론"));
        for(int i=0; i< userStudy.size(); i++){
            switch (userStudy.get(i).toString()){
                case "멀티미디어 프로그래밍" :
                    multiMediaProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    multiMediaProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(0); break;
                case "멀티미디어" :
                    multiMediaImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    multiMediaTextView.setTextColor(Color.BLACK);
                    subjects.remove(1); break;
                case "컴퓨터그래픽스" :
                    computerGraphicsImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    computerGraphicsTextView.setTextColor(Color.BLACK);
                    subjects.remove(2); break;
                case "게임 프로그래밍" :
                    gameProgrammingImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    gameProgrammingTextView.setTextColor(Color.BLACK);
                    subjects.remove(3); break;
                case "고급 실시간 그래픽스" :
                    premiumRealTimeGraphicsImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    premiumRealTimeGraphicsTextView.setTextColor(Color.BLACK);
                    subjects.remove(4); break;
                case "디지털 사운드" :
                    digitalSoundImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    digitalSoundTextView.setTextColor(Color.BLACK);
                    subjects.remove(5); break;
                case "가상현실" :
                    virtualRealityImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    virtualRealityTextView.setTextColor(Color.BLACK);
                    subjects.remove(6); break;
                case "컴퓨터 애니메이션" :
                    computerAnimationImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    computerAnimationTextView.setTextColor(Color.BLACK);
                    subjects.remove(7); break;
                case "증강현실" :
                    augmentedRealityImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    augmentedRealityTextView.setTextColor(Color.BLACK);
                    subjects.remove(8); break;
                case "HCI개론" :
                    HCIIntroductionImageView.setBackgroundColor(Color.rgb(52, 152, 219));
                    HCIIntroductionTextView.setTextColor(Color.BLACK);
                    subjects.remove(9); break;
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

    public void initializeSubjects(){

    }
}
