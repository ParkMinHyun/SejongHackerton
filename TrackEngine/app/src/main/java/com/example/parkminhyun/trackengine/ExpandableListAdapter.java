package com.example.parkminhyun.trackengine;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.example.parkminhyun.trackengine.R.id.checkBox;

public class ExpandableListAdapter extends BaseExpandableListAdapter  {

    private Context _context;
    String[] itemWords;
    List<String> items;

    private List<String> studyCheckList;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;


    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        this.studyCheckList = new ArrayList<>();
    }

    public void loadStudyData(){
        SharedPreferences settings = _context.getSharedPreferences("PREFS",0);
        String wordsString = settings.getString("studyNameList","");
        itemWords = wordsString.split(",");
        items = new ArrayList<String>();
        for(int i=0; i< itemWords.length; i++){
            items.add(itemWords[i]);
        }
    }

    public List<String> get_lstudyCheckList() {
        return studyCheckList;
    }

    public void set_lstudyCheckList(List<String> _studyList) {
        this.studyCheckList = _studyList;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.study_item, null);
        }

        final CheckBox studyCheckbox = (CheckBox) convertView.findViewById(checkBox);
        final TextView txtListChild = (TextView) convertView
                .findViewById(R.id.studyName);

        studyCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final boolean isChecked = studyCheckbox.isChecked();

                if(isChecked == true){
                    studyCheckList.add(txtListChild.getText().toString());
                }
                else{

                }
                // Do something here.
            }
        });

        for(int i=0; i< itemWords.length; i++){
            if(items.get(i).toString().equals(childText.toString()) && !items.get((i)).toString().equals("")){
                studyCheckbox.setChecked(true);
            }
        }

        txtListChild.setText(childText);
        return convertView;
    }



    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.semester_group, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}