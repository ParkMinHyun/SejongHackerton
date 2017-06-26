package com.example.parkminhyun.trackengine;

import android.annotation.SuppressLint;
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

public class AccreditAdapter extends RecyclerView.Adapter<AccreditAdapter.ItemViewHolder> {

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        CardView cv; // cardView
        TextView name; // 아이템 이름
        public ItemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv_accredit);
            name = (TextView)itemView.findViewById(R.id.accredit_name);
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