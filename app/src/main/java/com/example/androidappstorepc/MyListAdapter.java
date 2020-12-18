package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter< GameViewHolder > {

    private Context mContext;
    private Game[]  mFlowerList;

    MyListAdapter(Context mContext, Game[]  mFlowerList) {
        this.mContext = mContext;
        this.mFlowerList = mFlowerList;
    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_list_adapter, parent, false);
        return new GameViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final GameViewHolder holder, int position) {
        holder.mImage.setImageResource(mFlowerList[position].getImage());
        holder.mTitle.setText(mFlowerList[position].getName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Title", mFlowerList[(holder.getAdapterPosition())].getName());
                mIntent.putExtra("Description", mFlowerList[(holder.getAdapterPosition())].getDescribe());
                mIntent.putExtra("Image", mFlowerList[(holder.getAdapterPosition())].getImage());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFlowerList.length;
    }
}

class GameViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    CardView mCardView = itemView.findViewById(R.id.cardview);
    GameViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);

    }
}