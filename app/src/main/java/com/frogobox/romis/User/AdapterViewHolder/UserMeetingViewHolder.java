package com.frogobox.romis.User.AdapterViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.Admin.AdapterViewHolder.AdminMemberViewHolder;
import com.frogobox.romis.R;
import com.frogobox.romis.User.Object.UserMeetingObject;

import java.util.ArrayList;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 19/07/2018.
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
public class UserMeetingViewHolder extends RecyclerView.Adapter<UserMeetingViewHolder.MyViewHolder> {

    private Context context;
    private ArrayList<UserMeetingObject> mArrayList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView_namaRuangan, mTextView_agenda, mTextView_namaUser,
                mTextView_waktuAwal, mTextView_waktuAkhir, mTextView_noTelp;


        public MyViewHolder(View itemView) {
            super(itemView);

            mTextView_namaRuangan = (TextView) itemView.findViewById(R.id.textView_NamaRuangan);
            mTextView_agenda = (TextView) itemView.findViewById(R.id.textView_agenda);
            mTextView_namaUser = (TextView) itemView.findViewById(R.id.textView_namaUser);
            mTextView_waktuAwal = (TextView) itemView.findViewById(R.id.textView_WaktuAwal);
            mTextView_waktuAkhir = (TextView) itemView.findViewById(R.id.textView_WaktuAkhir);
            mTextView_noTelp = (TextView) itemView.findViewById(R.id.textView_noTelp);

        }
    }

    public UserMeetingViewHolder(Context context, ArrayList<UserMeetingObject> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }

    @Override
    public UserMeetingViewHolder.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_user_meeting, parent, false);
        UserMeetingViewHolder.MyViewHolder vh = new UserMeetingViewHolder.MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(UserMeetingViewHolder.MyViewHolder holder, int position) {

        holder.mTextView_namaRuangan.setText(mArrayList.get(position).getNamaRuangan());
        holder.mTextView_agenda.setText(mArrayList.get(position).getAgenda());
        holder.mTextView_namaUser.setText(mArrayList.get(position).getNamaUser());
        holder.mTextView_waktuAwal.setText(mArrayList.get(position).getWaktuAwal());
        holder.mTextView_waktuAkhir.setText(mArrayList.get(position).getWaktuAkhir());
        holder.mTextView_noTelp.setText(mArrayList.get(position).getNoTelp());

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
