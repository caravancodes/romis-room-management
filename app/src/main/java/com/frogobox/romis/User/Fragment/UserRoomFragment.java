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
import com.frogobox.romis.User.AdapterViewHolder.UserRoomViewHolder;
import com.frogobox.romis.User.Object.UserMeetingObject;
import com.frogobox.romis.User.Object.UserRoomObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserRoomFragment extends Fragment {


    public UserRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_user_room, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);

        ArrayList<UserRoomObject> mArrayList = new ArrayList<>();
        UserRoomViewHolder adapter = new UserRoomViewHolder(getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new UserRoomObject("Gundam", "24 Orang", "Lantai 3", R.drawable.room1));
        mArrayList.add(new UserRoomObject("Parango", "8 Orang", "Lantai 3", R.drawable.room2));
        mArrayList.add(new UserRoomObject("Galunggung", "20 Orang", "Lantai 3", R.drawable.room3));
        mArrayList.add(new UserRoomObject("Skuadron", "10 Orang", "Lantai 3", R.drawable.room4));

        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
    }

}
