package com.frogobox.romis.User.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.R;
import com.frogobox.romis.User.AdapterViewHolder.UserMeetingViewHolder;
import com.frogobox.romis.User.AdapterViewHolder.UserWaitingListViewHolder;
import com.frogobox.romis.User.Object.UserMeetingObject;
import com.frogobox.romis.User.Object.UserWaitingListObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserWaitingListFragment extends Fragment {


    public UserWaitingListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_user_waiting_list, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);

        ArrayList<UserWaitingListObject> mArrayList = new ArrayList<>();
        UserWaitingListViewHolder adapter = new UserWaitingListViewHolder (getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new UserWaitingListObject("Gundam", "RAPAT penting telkom wajib hadir semua sangat penting", "Faisal Amir",
                "13.00", "17.00", "081357108568","22 Juli 2018",
                "PENTING", "WAITING APPROVAL"));


        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
    }

}
