package com.frogobox.romis.User.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.Admin.AdapterViewHolder.AdminMemberViewHolder;
import com.frogobox.romis.Admin.Object.AdminMemberObject;
import com.frogobox.romis.Helper.FunctionHelper;
import com.frogobox.romis.R;
import com.frogobox.romis.User.AdapterViewHolder.UserMeetingViewHolder;
import com.frogobox.romis.User.Object.UserMeetingObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserMeetingFragment extends Fragment {

    private FunctionHelper mFunctionHelper = new FunctionHelper();

    public UserMeetingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_user_meeting, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);

        TextView mTextView_tanggal = (TextView) rootView.findViewById(R.id.textView_tanggal);
        mTextView_tanggal.setText(mFunctionHelper.getDateToday());

        ArrayList<UserMeetingObject> mArrayList = new ArrayList<>();
        UserMeetingViewHolder adapter = new UserMeetingViewHolder(getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new UserMeetingObject("Gundam", "Rekon Radio IP", "Faisal Amir", "13.00", "17.00", "081357108568"));
        mArrayList.add(new UserMeetingObject("Galunggung", "Evaluasi Progress Kerja Praktek", "Rifki Al Hakim", "13.00", "17.00", "081357108568"));

        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
    }

}
