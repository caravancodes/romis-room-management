package com.frogobox.romis.User;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.frogobox.romis.R;
import com.frogobox.romis.User.Object.UserReservationObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 25/07/2018.
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
public class UserReservationAdapter extends ArrayAdapter<UserReservationObject> {

    private AlertDialog.Builder dialog;
    private LayoutInflater inflater;
    private View dialogView;


    public UserReservationAdapter(Context context, ArrayList<UserReservationObject> array) {
        super(context, 0, array);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.content_user_reservation, parent, false);
        }

        UserReservationObject uso = getItem(position);

        TextView mTextjam = (TextView) listItemView.findViewById(R.id.TextJam);
        TextView mTextstatus = (TextView) listItemView.findViewById(R.id.TextStatus);
        Button mButton = (Button) listItemView.findViewById(R.id.Button_booked);

        mTextjam.setText(uso.getJam());
        if (uso.getStatus() == 1) {
            mTextstatus.setText("BOOKED");
            mTextstatus.setTextColor(R.color.colorPrimary);
            mButton.setVisibility(View.GONE);
        } else {
            mTextstatus.setText("AVAILABLE");
            mTextstatus.setTextColor(R.color.colorPrimary);
            mButton.setVisibility(View.VISIBLE);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogForm();
                }
            });
        }



        return listItemView;
    }

    private void DialogForm() {

        // -----------------------------------------------------------------------------------------
        // Deklarasi Element XML Update View
        dialog = new AlertDialog.Builder(getContext());
        inflater = LayoutInflater.from(getContext());
        dialogView = inflater.inflate(R.layout.popup_user_booking, null);
        // -----------------------------------------------------------------------------------------
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        // -----------------------------------------------------------------------------------------

        // -----------------------------------------------------------------------------------------

        dialog.setPositiveButton("BOOKING", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss(); // Keluar Dari Dialog
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // Keluar Dari Dialog
            }
        });

        dialog.show();
    }


}
