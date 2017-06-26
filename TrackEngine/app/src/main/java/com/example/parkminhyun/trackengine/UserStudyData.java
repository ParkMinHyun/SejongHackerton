package com.example.parkminhyun.trackengine;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import static com.example.parkminhyun.trackengine.ExpandableListAdapter.items;

public class UserStudyData {

    Context context;
    String[] studyList;
    public UserStudyData(Context context){
        this.context = context;
    }

    public List<String> loadStudyDataList(){
        SharedPreferences settings = context.getSharedPreferences("PREFS",0);
        String wordsString = settings.getString("studyNameList","");
        studyList = wordsString.split(",");
        items = new ArrayList<String>();
        for(int i=0; i< studyList.length; i++){
            items.add(studyList[i]);
        }

        return items;
    }

    public void loadStudyData(){
        SharedPreferences settings = context.getSharedPreferences("PREFS",0);
        String wordsString = settings.getString("studyNameList","");
        studyList = wordsString.split(",");
        items = new ArrayList<String>();
        for(int i=0; i< studyList.length; i++){
            items.add(studyList[i]);
        }
    }
}
