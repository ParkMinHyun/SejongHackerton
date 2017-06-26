package com.example.parkminhyun.trackengine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 12aud on 2017-06-26.
 */

public class AccreditAdapter extends RecyclerView.Adapter<AccreditAdapter.ItemViewHolder> {

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        CardView cv; // cardView
        TextView name; // 아이템 이름
        Context mContext;

        public ItemViewHolder(final View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv_accredit);

            name = (TextView)itemView.findViewById(R.id.accredit_name);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("onClick",name.getText().toString());
                    if(name.getText().equals("공업수학1"))
                    {
                        new AlertDialog.Builder(itemView.getContext()).setTitle("공학수학1")
                                .setMessage("공학도가 기본적으로 습득해야 할 수학분야인 상미분방정식의 " +
                                        "기본개념을 이해시키고 여러 형태의 상미분 방정식과 그에 관한 해법을" +
                                        " 체계적으로 지도하여 다양한 공학분야의 전공과목 이수를 도울 뿐만 아니라, 수학적 소양과 과학적 사고 능력을 배양한다.")
                                .setNeutralButton("닫기",new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dig,int sumthin){
                                    }
                                }).show();
                    }
                    else if(name.getText().equals("컴퓨터네트워크"))
                    {
                        new AlertDialog.Builder(itemView.getContext()).setTitle("컴퓨터네트워크")
                                .setMessage("컴퓨터 네트워크의 계층화된 구조를 알아보고 관련된 프로토콜과 라우팅 알고리즘들에 대해서 학습한다.")
                                .setNeutralButton("닫기",new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dig,int sumthin){
                                    }
                                }).show();
                    }
                    else if(name.getText().equals("이산수학및프로그래밍"))
                    {
                        new AlertDialog.Builder(itemView.getContext()).setTitle("이산수학및프로그래밍")
                                .setMessage("컴퓨터는 이진수 체계로 운영되는 특성상 그 응용과정에서도 주로 이산적인 자료를 대상으로 하게 된다. 컴퓨터에 관련된 집합과 함수, 행렬, 부울대수, 알고리즘 등의 수학적 배경을 학습한다.")
                                .setNeutralButton("닫기",new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dig,int sumthin){
                                    }
                                }).show();
                    }
                    else if(name.getText().equals("알고리즘및실습"))
                    {
                        new AlertDialog.Builder(itemView.getContext()).setTitle("알고리즘및실습")
                                .setMessage("알고리즘이란 어떤 구체적 목표를 달성하기 위한 분명한 절차를 말한다. 컴퓨터를 사용하여 어러 가지 유형의 문제를 해결하는 일반적인 알고리즘 기법을 소개한다.")
                                .setNeutralButton("닫기",new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dig,int sumthin){
                                    }
                                }).show();
                    }
//                    switch(name.getText())
//                    {
//                        case "공업수학1":
//                            mContext.startActivity(new Intent(mContext, VirtualRealityActivity.class));
//                            break;
//                        case 1:
//                            mContext.startActivity(new Intent(mContext, ArtificialIntelligenceActivity.class));
//                            break;
//                        case 2:
//                            mContext.startActivity(new Intent(mContext, ApplicationSWActivity.class));
//                            break;
//                        case 3:
//                            mContext.startActivity(new Intent(mContext, HCIAndVCActivity.class));
//                            break;
//                        case 4:
//                            mContext.startActivity(new Intent(mContext, MultiMediaActivity.class));
//                            break;
//                    ((AdapterCallback)mContext).startEachActivity(getPosition());
                }
            });
        }
    }

    List<Item> items;
    Context mContext;

    public AccreditAdapter(Context context, List<Item> items)
    {
        this.mContext = context;
        this.items = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.accredit_card, viewGroup, false);
        ItemViewHolder ivh = new ItemViewHolder(v);
        return ivh;
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.name.setText(items.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

}
