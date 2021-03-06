package com.example.parkminhyun.trackengine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;

import java.util.List;

/**
 * Created by 12aud on 2017-06-26.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ItemViewHolder> {

    com.daimajia.numberprogressbar.NumberProgressBar progressBar;
    private String[] userStudyofTrack;
    private int trackCnt = 0;

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        CardView cv; // cardView
        TextView name; // 아이템 이름
        public ItemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("onClick",String.valueOf(getPosition()));
                    switch(getPosition())
                    {
                        case 0:
                            Intent intent = new Intent(mContext, VirtualRealityActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mContext.startActivity(intent);
                            break;
                        case 1:
                            Intent intent2 = new Intent(mContext, ArtificialIntelligenceActivity.class);
                            intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mContext.startActivity(intent2);
                            break;
                        case 2:
                            Intent intent3 = new Intent(mContext, ApplicationSWActivity.class);
                            intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mContext.startActivity(intent3);
                            break;
                        case 3:
                            Intent intent4 = new Intent(mContext, HCIAndVCActivity.class);
                            intent4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mContext.startActivity(intent4);
                            break;
                        case 4:
                            Intent intent5 = new Intent(mContext, MultiMediaActivity.class);
                            intent5.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mContext.startActivity(intent5);
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                    }
//                    ((AdapterCallback)mContext).startEachActivity(getPosition());
                }
            });
            name = (TextView)itemView.findViewById(R.id.item_name);
        }
    }

    List<Item> items;
    Context mContext;

    public RVAdapter(Context context, List<Item> items, String[] userStudyofTrack)
    {
        this.mContext = context;
        this.items = items;
        this.userStudyofTrack = userStudyofTrack;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_track, viewGroup, false);
        progressBar = (NumberProgressBar) v.findViewById(R.id.numberbar1);

        progressBar.setProgress(Integer.valueOf(userStudyofTrack[trackCnt]));
        trackCnt ++;

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
