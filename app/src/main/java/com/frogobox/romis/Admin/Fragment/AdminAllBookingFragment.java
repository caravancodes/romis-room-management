package com.frogobox.romis.Admin.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frogobox.romis.Admin.AdapterViewHolder.AdminAllBookingViewHolder;
import com.frogobox.romis.Admin.Object.AdminAllBookingObject;
import com.frogobox.romis.Helper.FunctionHelper;
import com.frogobox.romis.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdminAllBookingFragment extends Fragment {

    private FunctionHelper mFunctionHelper = new FunctionHelper();

    public AdminAllBookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        
        View rootView = inflater.inflate(R.layout.fragment_admin_all_booking, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);



        ArrayList<AdminAllBookingObject> mArrayList = new ArrayList<>();
        AdminAllBookingViewHolder adapter = new AdminAllBookingViewHolder(getContext(), mArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        mArrayList.add(new AdminAllBookingObject("Parango", "Rapat mengenai peserta kerja praktek", "Rifki Al Hakim",
                "13.00", "17.00", "081357108568","11 Agustus 2018",
                "Tidak ada catatan"));

        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);

        return rootView;
        
    
    }

}
