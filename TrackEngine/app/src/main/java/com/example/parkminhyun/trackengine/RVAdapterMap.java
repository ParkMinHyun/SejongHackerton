package com.example.parkminhyun.trackengine;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 12aud on 2017-06-27.
 */

public class RVAdapterMap extends RecyclerView.Adapter<RVAdapterMap.MapViewHolder> {


public class MapViewHolder extends RecyclerView.ViewHolder {
    CardView cv; // cardView
    TextView trackName;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;
    ImageView iv11;

    public MapViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cv_map);
        trackName = (TextView)itemView.findViewById(R.id.tv_track_map_cv);
        tv1 = (TextView) itemView.findViewById(R.id.tv1_map_cv);
        tv2 = (TextView) itemView.findViewById(R.id.tv2_map_cv);
        tv3 = (TextView) itemView.findViewById(R.id.tv3_map_cv);
        tv4 = (TextView) itemView.findViewById(R.id.tv4_map_cv);
        tv5 = (TextView) itemView.findViewById(R.id.tv5_map_cv);
        tv6 = (TextView) itemView.findViewById(R.id.tv6_map_cv);
        tv7 = (TextView) itemView.findViewById(R.id.tv7_map_cv);
        tv8 = (TextView) itemView.findViewById(R.id.tv8_map_cv);
        tv9 = (TextView) itemView.findViewById(R.id.tv9_map_cv);
        tv10 = (TextView) itemView.findViewById(R.id.tv10_map_cv);
        tv11 = (TextView) itemView.findViewById(R.id.tv11_map_cv);
        iv1 = (ImageView) itemView.findViewById(R.id.iv1_map_cv);
        iv2 = (ImageView) itemView.findViewById(R.id.iv2_map_cv);
        iv3 = (ImageView) itemView.findViewById(R.id.iv3_map_cv);
        iv4 = (ImageView) itemView.findViewById(R.id.iv4_map_cv);
        iv5 = (ImageView) itemView.findViewById(R.id.iv5_map_cv);
        iv6 = (ImageView) itemView.findViewById(R.id.iv6_map_cv);
        iv7 = (ImageView) itemView.findViewById(R.id.iv7_map_cv);
        iv8 = (ImageView) itemView.findViewById(R.id.iv8_map_cv);
        iv9 = (ImageView) itemView.findViewById(R.id.iv9_map_cv);
        iv10 = (ImageView) itemView.findViewById(R.id.iv10_map_cv);
        iv11 = (ImageView) itemView.findViewById(R.id.iv11_map_cv);
    }
}

    public RVAdapterMap(List<MapVO> maps){
        this.maps = maps;
    }
    List<MapVO> maps;

    @Override
    public MapViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.map_track, viewGroup, false);
        MapViewHolder mvh = new MapViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MapViewHolder holder, int position) {
        holder.trackName.setText(maps.get(position).getTrackName());
        holder.tv1.setText(maps.get(position).getSub0());
        holder.tv2.setText(maps.get(position).getSub1());
        holder.tv3.setText(maps.get(position).getSub2());
        holder.tv4.setText(maps.get(position).getSub3());
        holder.tv5.setText(maps.get(position).getSub4());
        holder.tv6.setText(maps.get(position).getSub5());
        holder.tv7.setText(maps.get(position).getSub6());
        holder.tv8.setText(maps.get(position).getSub7());
        holder.tv9.setText(maps.get(position).getSub8());
        holder.tv10.setText(maps.get(position).getSub9());
        holder.tv11.setText(maps.get(position).getSub10());
    }

    @Override
    public int getItemCount() {
        return maps.size();
    }
}

