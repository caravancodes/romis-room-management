package com.frogobox.romis.Admin.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frogobox.romis.R;
import com.frogobox.romis.Admin.AdapterViewHolder.AdminRoomViewHolder;
import com.frogobox.romis.Admin.Object.AdminRoomObject;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdminRoomFragment extends Fragment {


    public AdminRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_user_room, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);

        ArrayList<AdminRoomObject> mArrayList = new ArrayList<>();
        AdminRoomViewHolder adapter = new AdminRoomViewHolder(getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new AdminRoomObject("Gundam", "24 Orang", "Lantai 3", R.drawable.room1));
        mArrayList.add(new AdminRoomObject("Parango", "8 Orang", "Lantai 3", R.drawable.room2));
        mArrayList.add(new AdminRoomObject("Galunggung", "20 Orang", "Lantai 3", R.drawable.room3));
        mArrayList.add(new AdminRoomObject("Skuadron", "10 Orang", "Lantai 3", R.drawable.room4));

        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
        
        
    }

}
