package com.frogobox.romis.User.AdapterViewHolder;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.frogobox.romis.R;
import com.frogobox.romis.User.Object.UserRoomObject;
import com.frogobox.romis.User.UserReservationActivity;

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
public class UserRoomViewHolder extends RecyclerView.Adapter<UserRoomViewHolder.MyViewHolder>{

    public Context context;
    public ArrayList<UserRoomObject> mArrayList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView_namaRuangan, mTextView_kapasitas, mTextView_posisi;
        ImageView mImageView_foto;
        CardView mCardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            mTextView_namaRuangan = (TextView) itemView.findViewById(R.id.textView_NamaRuangan);
            mTextView_kapasitas = (TextView) itemView.findViewById(R.id.textView_kapasitas);
            mTextView_posisi = (TextView) itemView.findViewById(R.id.textView_posisi);
            mImageView_foto = (ImageView) itemView.findViewById(R.id.imageView_fotoRuang);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);

        }
    }

    public UserRoomViewHolder(Context context, ArrayList<UserRoomObject> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_user_room, parent, false);
        UserRoomViewHolder.MyViewHolder vh = new UserRoomViewHolder.MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.mTextView_posisi.setText(mArrayList.get(position).getPosisi());
        holder.mTextView_namaRuangan.setText(mArrayList.get(position).getNamaRuang());
        holder.mTextView_kapasitas.setText(mArrayList.get(position).getKapasitas());
        holder.mImageView_foto.setImageResource(mArrayList.get(position).getFoto());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, UserReservationActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
