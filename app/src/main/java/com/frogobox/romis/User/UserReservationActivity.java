package com.frogobox.romis.User;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.frogobox.romis.Admin.Object.AdminApprovalObject;
import com.frogobox.romis.Helper.FunctionHelper;
import com.frogobox.romis.R;
import com.frogobox.romis.User.Object.UserReservationObject;

import java.util.ArrayList;

public class UserReservationActivity extends AppCompatActivity {

    private FunctionHelper mFunctionHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reservation);


        mFunctionHelper = new FunctionHelper();
        ListView mListView = (ListView) findViewById(R.id.listView);

        TextView mTextViewTanggal = (TextView) findViewById(R.id.textView_tanggal);
        mTextViewTanggal.setText(mFunctionHelper.getDateToday());
        ArrayList<UserReservationObject> arrayWord = new ArrayList<>();

        arrayWord.add(new UserReservationObject("08.00", 0));
        arrayWord.add(new UserReservationObject("09.00", 0));
        arrayWord.add(new UserReservationObject("10.00", 1));
        arrayWord.add(new UserReservationObject("11.00", 1));
        arrayWord.add(new UserReservationObject("12.00", 1));
        arrayWord.add(new UserReservationObject("13.00", 0));
        arrayWord.add(new UserReservationObject("14.00", 0));
        arrayWord.add(new UserReservationObject("15.00", 0));
        arrayWord.add(new UserReservationObject("16.00", 0));
        arrayWord.add(new UserReservationObject("17.00", 0));

        UserReservationAdapter mAdapter = new UserReservationAdapter(this, arrayWord);

        mListView.setAdapter(mAdapter);

    }
}
