package com.frogobox.romis.User.AdapterViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.R;
import com.frogobox.romis.User.Object.UserWaitingListObject;

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
public class UserWaitingListViewHolder extends RecyclerView.Adapter<UserWaitingListViewHolder.MyViewHolder> {

    private Context context;
    private ArrayList<UserWaitingListObject> mArrayList;

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView_namaRuangan, mTextView_agenda,
                mTextView_waktuAwal, mTextView_waktuAkhir, mTextView_noTelp, mTextView_date, mTextView_note, mTextView_status;

        public MyViewHolder(View itemView) {
            super(itemView);

            mTextView_namaRuangan = (TextView) itemView.findViewById(R.id.textView_NamaRuangan);
            mTextView_agenda = (TextView) itemView.findViewById(R.id.textView_agenda);
            mTextView_waktuAwal = (TextView) itemView.findViewById(R.id.textView_WaktuAwal);
            mTextView_waktuAkhir = (TextView) itemView.findViewById(R.id.textView_WaktuAkhir);
            mTextView_noTelp = (TextView) itemView.findViewById(R.id.textView_noTelp);
            mTextView_date = (TextView) itemView.findViewById(R.id.textView_date);
            mTextView_note = (TextView) itemView.findViewById(R.id.textView_Note);
            mTextView_status = (TextView) itemView.findViewById(R.id.textView_status);

        }
    }


    public UserWaitingListViewHolder(Context context, ArrayList<UserWaitingListObject> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }


    @Override
    public UserWaitingListViewHolder.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_user_waiting_list, parent, false);
        UserWaitingListViewHolder.MyViewHolder vh = new UserWaitingListViewHolder.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mTextView_namaRuangan.setText(mArrayList.get(position).getNamaRuang());
        holder.mTextView_agenda.setText(mArrayList.get(position).getAgenda());
        holder.mTextView_waktuAwal.setText(mArrayList.get(position).getWaktuAwal());
        holder.mTextView_waktuAkhir.setText(mArrayList.get(position).getWaktuAkhir());
        holder.mTextView_noTelp.setText(mArrayList.get(position).getNoTelp());
        holder.mTextView_date.setText(mArrayList.get(position).getDate());
        holder.mTextView_note.setText(mArrayList.get(position).getNote());
        holder.mTextView_status.setText(mArrayList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
