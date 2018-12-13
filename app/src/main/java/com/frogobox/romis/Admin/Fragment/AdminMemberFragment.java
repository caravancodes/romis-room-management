package com.frogobox.romis.Admin.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frogobox.romis.Admin.AdapterViewHolder.AdminMemberViewHolder;
import com.frogobox.romis.Admin.Object.AdminMemberObject;
import com.frogobox.romis.R;

import java.util.ArrayList;

public class AdminMemberFragment extends Fragment {
    public AdminMemberFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_admin_member, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);

        ArrayList<AdminMemberObject> mDataset = new ArrayList<>();
        mDataset.add(new AdminMemberObject("Amir", "11762", R.drawable.amir_merah));
        mDataset.add(new AdminMemberObject("Faisal Amir", "11762", R.drawable.new_amir));
        mDataset.add(new AdminMemberObject("Navisah Cahya", "11762", R.color.colorPrimary));
        mDataset.add(new AdminMemberObject("Rifki Al Hakim", "11762", R.color.colorPrimary));


        AdminMemberViewHolder adapter = new AdminMemberViewHolder(getContext(), mDataset);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);



        return rootView;
    }

}