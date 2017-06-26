package com.example.parkminhyun.trackengine;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 12aud on 2017-06-26.
 */

public class RVAdapterVirtualReality extends RecyclerView.Adapter<RVAdapterVirtualReality.SubjectViewHolder> {
    public class SubjectViewHolder extends RecyclerView.ViewHolder{
        CardView cv; // cardView
        TextView text; // 학기와 교과목 명 더한것
        public SubjectViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv_subject);
            text = (TextView)itemView.findViewById(R.id.cv_subject_num);
        }
    }

    private List<Subject> subjects;
    private Context mContext;

    public RVAdapterVirtualReality(Context context, List<Subject> subjects){
        this.mContext = context;
        this.subjects = subjects;
    }

    @Override
    public SubjectViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_subject, viewGroup, false);
        SubjectViewHolder svh = new SubjectViewHolder(v);
        return svh;
    }

    @Override
    public void onBindViewHolder(SubjectViewHolder holder, int i) {
        holder.text.setText(subjects.get(i).getNum() + " " + subjects.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

}
