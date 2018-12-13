package com.frogobox.romis.Admin.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frogobox.romis.Admin.AdapterViewHolder.AdminApprovalViewHolder;
import com.frogobox.romis.Admin.Object.AdminApprovalObject;
import com.frogobox.romis.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdminApprovalFragment extends Fragment {


    public AdminApprovalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_admin_approval, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);

        ArrayList<AdminApprovalObject> mArrayList = new ArrayList<>();
        AdminApprovalViewHolder adapter = new AdminApprovalViewHolder (getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new AdminApprovalObject("Gundam", "RAPAT penting telkom wajib hadir semua sangat penting", "Amir",
                "13.00", "17.00", "081357108568","10 Agustus 2018",
                "Tidak ada catatan"));
        mArrayList.add(new AdminApprovalObject("Parango", "Pembahasan Lanjutan Rapat mengenai Cisco", "Navisah Cahya",
                "08.00", "12.00", "081357108568","14 Agustus 2018",
                "Tidak ada catatan"));
        mArrayList.add(new AdminApprovalObject("Galunggung", "Weekly meeting ISO", "Rifki Al Hakim",
                "13.00", "15.00", "081357108568","16 Agustus 2018",
                "Tidak ada catatan"));
        mArrayList.add(new AdminApprovalObject("Skuadron", "Weekly meeting ISO bagian ke 2", "Faisal Amir",
                "09.00", "11.00", "081357108568","20 Agustus 2018",
                "Tidak ada catatan"));

        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
    }

}
