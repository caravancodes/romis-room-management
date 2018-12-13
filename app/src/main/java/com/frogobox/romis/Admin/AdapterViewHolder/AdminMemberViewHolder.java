package com.frogobox.romis.Admin.AdapterViewHolder;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.Admin.Object.AdminMemberObject;
import com.frogobox.romis.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 15/07/2018.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */

public class AdminMemberViewHolder extends RecyclerView.Adapter<AdminMemberViewHolder.MyViewHolder> {

    private Context context;
    private ArrayList<AdminMemberObject> mArrayList;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public CardView mCardView;
        public TextView mTextViewName;
        public TextView mTextViewId;
        public CircleImageView mCircleImageView;

        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextViewName = (TextView) v.findViewById(R.id.textView_name);
            mTextViewId = (TextView) v.findViewById(R.id.textView_id);
            mCircleImageView = (CircleImageView) v.findViewById(R.id.image_card_view);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)


    public AdminMemberViewHolder(Context context, ArrayList<AdminMemberObject> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdminMemberViewHolder.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_admin_member, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextViewName.setText(mArrayList.get(position).getNama());
        holder.mTextViewId.setText(mArrayList.get(position).getNama());
        holder.mCircleImageView.setImageResource(mArrayList.get(position).getFoto());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
